package com.ceiba.alquilervehiculo.servicio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;

public class ServicioCrearAlquilerVehiculo {


    private static final String EL_ALQUILER_YA_EXISTE_EN_EL_SISTEMA = "El alquiler ya existe en el sistema";

    private final RepositorioAlquilerVehiculo repositorioAlquilerVehiculo;
    private final RepositorioVehiculo repositorioVehiculo;
    private final RepositorioUsuario repositorioUsuario;
    private static final int CANTIDAD_DIAS_DESCUENTO =2;
    private static double  DESCUENTO_20_PORCIENTO=0.8;


    public ServicioCrearAlquilerVehiculo(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo, RepositorioVehiculo repositorioVehiculo, RepositorioUsuario repositorioUsuario) {
        this.repositorioAlquilerVehiculo = repositorioAlquilerVehiculo;
        this.repositorioVehiculo = repositorioVehiculo;
        this.repositorioUsuario = repositorioUsuario;

    }



    public Long ejecutar(AlquilerVehiculo alquilerVehiculo) {

        validarExistenciaPrevia(alquilerVehiculo);
        Usuario usuario = obetenerUsuarioDeAlquiler(alquilerVehiculo);
        Vehiculo vehiculo = obetenerVehiculoDeAlquiler(alquilerVehiculo);

        this.calcularValorTotalParcial(alquilerVehiculo, vehiculo);
        return this.repositorioAlquilerVehiculo.crear(alquilerVehiculo);


    }

    private void validarExistenciaPrevia(AlquilerVehiculo alquilerVehiculo) {
        boolean existe = this.repositorioAlquilerVehiculo.existe(alquilerVehiculo.getId());
        if (existe) {
            throw new ExcepcionDuplicidad(EL_ALQUILER_YA_EXISTE_EN_EL_SISTEMA);
        }
    }


    private double calcularValorTotalParcial(AlquilerVehiculo alquilerVehiculo, Vehiculo vehiculo) {



        if (alquilerVehiculo.getCantidadDiasAlquiler() > CANTIDAD_DIAS_DESCUENTO) {
            alquilerVehiculo.setValorTotalParcial((vehiculo.getPrecioAlquilerPorDia() * alquilerVehiculo.getCantidadDiasAlquiler()) * (DESCUENTO_20_PORCIENTO));
        } else {
           alquilerVehiculo.setValorTotalParcial(vehiculo.getPrecioAlquilerPorDia() * alquilerVehiculo.getCantidadDiasAlquiler());
        }

        return alquilerVehiculo.getValorTotalParcial();
    }

    private Vehiculo obetenerVehiculoDeAlquiler(AlquilerVehiculo alquilerVehiculo) {
        Vehiculo vehiculo = repositorioVehiculo.finById(alquilerVehiculo.getVehiculosId());

        if (vehiculo == null) {
            throw new ExcepcionSinDatos("No existe el vehiculo a alquilar");
        }
        return vehiculo;
    }

    private Usuario obetenerUsuarioDeAlquiler(AlquilerVehiculo alquilerVehiculo) {


        Usuario usuario = repositorioUsuario.finById(alquilerVehiculo.getUsuariosId());

        if (usuario == null) {
            throw new ExcepcionSinDatos("El usuario no esta registrado");
        }
        return usuario;
    }


}
