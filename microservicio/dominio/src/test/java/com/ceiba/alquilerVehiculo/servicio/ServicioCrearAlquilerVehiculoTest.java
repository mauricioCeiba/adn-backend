package com.ceiba.alquilerVehiculo.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.alquilerVehiculo.servicio.testdatabuilder.AlquilerVehiculoTestDataBuilder;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioCrearAlquilerVehiculo;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.testdatabuilder.VehiculoTestDataBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ServicioCrearAlquilerVehiculoTest {


    @Test
    public void validarValorTotalParcialTest() {
        // arrange

        AlquilerVehiculo alquilerVehiculo = new AlquilerVehiculoTestDataBuilder().conCantidadDiasAlquiler(5).conIdVehiculo(10L).conId(3L).build();
        Vehiculo vehiculo = new VehiculoTestDataBuilder().conId(10L).conPlaca("123icx").build();
        Usuario usuario = new UsuarioTestDataBuilder().conId(1L).conCedula("987654566").build();

        RepositorioAlquilerVehiculo repositorioAlquilerVehiculo = Mockito.mock(RepositorioAlquilerVehiculo.class);
        RepositorioVehiculo repositorioVehiculo = Mockito.mock(RepositorioVehiculo.class);
        RepositorioUsuario repositorioUsuario = Mockito.mock(RepositorioUsuario.class);

        Mockito.when(repositorioVehiculo.finById(Mockito.anyLong())).thenReturn(vehiculo);
        Mockito.when(repositorioUsuario.finById(Mockito.anyLong())).thenReturn(usuario);

        ServicioCrearAlquilerVehiculo servicioCrearAlquilerVehiculo = new ServicioCrearAlquilerVehiculo(repositorioAlquilerVehiculo, repositorioVehiculo, repositorioUsuario);

        servicioCrearAlquilerVehiculo.ejecutar(alquilerVehiculo);

        Double actual = alquilerVehiculo.getValorTotalParcial();
        Double esperado = Double.valueOf(4000);

        assertEquals(actual, esperado);
    }

    @Test
    public void validarExisteAlquiler() {

        RepositorioVehiculo repositorioVehiculo = Mockito.mock(RepositorioVehiculo.class);
        RepositorioUsuario repositorioUsuario = Mockito.mock(RepositorioUsuario.class);

        AlquilerVehiculo alquilerVehiculo = new AlquilerVehiculoTestDataBuilder().conId(1L).build();
        RepositorioAlquilerVehiculo repositorioAlquilerVehiculo = Mockito.mock(RepositorioAlquilerVehiculo.class);
        Mockito.when(repositorioAlquilerVehiculo.existe(Mockito.anyLong())).thenReturn(true);
        ServicioCrearAlquilerVehiculo servicioCrearAlquilerVehiculo = new ServicioCrearAlquilerVehiculo(repositorioAlquilerVehiculo,repositorioVehiculo,repositorioUsuario);

        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearAlquilerVehiculo.ejecutar(alquilerVehiculo), ExcepcionDuplicidad.class, "El alquiler ya existe en el sistema");

    }
}
