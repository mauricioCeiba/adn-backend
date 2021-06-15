package com.ceiba.alquilerVehiculo.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.alquilerVehiculo.servicio.testdatabuilder.AlquilerVehiculoTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.ServicioActualizarVehiculo;
import org.junit.Test;
import org.mockito.Mockito;

public class ServicioActualizarAlquilerVehiculoTest {

    @Test
    public void validarUsuarioExistenciaPreviaTest() {
        // arrange
    /*    Vehiculo vehiculo = new AlquilerVehiculoTestDataBuilder(servicioCrearAlquiler).conId(1L).conPlaca("icx123").build();
        RepositorioVehiculo repositorioVehiculo = Mockito.mock(RepositorioVehiculo.class);
        Mockito.when(repositorioVehiculo.existeExcluyendoId(Mockito.anyLong(),Mockito.anyString())).thenReturn(true);
        ServicioActualizarVehiculo servicioActualizarVehiculo = new ServicioActualizarVehiculo(repositorioVehiculo);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarVehiculo.ejecutar(vehiculo), ExcepcionDuplicidad.class,"El vehiculo ya existe en el sistema");
   */ }
}
