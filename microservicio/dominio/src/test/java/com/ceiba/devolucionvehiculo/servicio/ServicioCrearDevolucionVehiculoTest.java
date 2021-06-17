package com.ceiba.devolucionvehiculo.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.alquilerVehiculo.servicio.testdatabuilder.AlquilerVehiculoTestDataBuilder;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioCrearAlquilerVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.testdatabuilder.DevolucionVehiculoTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.ServicioCrearUsuario;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.ServicioCrearVehiculo;
import com.ceiba.vehiculo.servicio.testdatabuilder.VehiculoTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class ServicioCrearDevolucionVehiculoTest {

    @Test
    public void validarCalcularTotalAPagar() {
        // arrange
        DevolucionVehiculoTestDataBuilder devolucionVehiculoTestDataBuilder = new DevolucionVehiculoTestDataBuilder().conPorcentajeDeDano(11);
        DevolucionVehiculo devolucionVehiculo= devolucionVehiculoTestDataBuilder.build();

        AlquilerVehiculo alquilerVehiculo = new AlquilerVehiculoTestDataBuilder().conCantidadDiasAlquiler(4).conValorTotalParcial(100000).conIdVehiculo(1L).conId(1L).build();
        Vehiculo vehiculo = new VehiculoTestDataBuilder().conId(10L).conPlaca("123icx").build();

        alquilerVehiculo.setValorTotalParcial(40000);

        RepositorioAlquilerVehiculo repositorioAlquilerVehiculo = Mockito.mock(RepositorioAlquilerVehiculo.class);
        Mockito.when(repositorioAlquilerVehiculo.finById(Mockito.anyLong())).thenReturn(alquilerVehiculo);


        RepositorioVehiculo repositorioVehiculo = Mockito.mock(RepositorioVehiculo.class);
        Mockito.when(repositorioVehiculo.finById(Mockito.anyLong())).thenReturn(vehiculo);

        RepositorioDevolucionVehiculo repositorioDevolucionVehiculo = Mockito.mock(RepositorioDevolucionVehiculo.class);
        Mockito.when(repositorioDevolucionVehiculo.finById(Mockito.anyLong())).thenReturn(devolucionVehiculo);


        ServicioCrearDevolucionVehiculo servicioCrearDevolucionVehiculo= new ServicioCrearDevolucionVehiculo(repositorioDevolucionVehiculo,repositorioVehiculo,repositorioAlquilerVehiculo);
        servicioCrearDevolucionVehiculo.ejecutar(devolucionVehiculo);


        Double esperado = Double.valueOf(52500);
        assertEquals(esperado, (Double)devolucionVehiculo.getValorTotalAPagar());

 }



}
