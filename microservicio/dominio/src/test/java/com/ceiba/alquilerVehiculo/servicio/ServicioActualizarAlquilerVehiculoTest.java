package com.ceiba.alquilerVehiculo.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.alquilerVehiculo.servicio.testdatabuilder.AlquilerVehiculoTestDataBuilder;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioActualizarAlquilerVehiculo;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.ServicioActualizarVehiculo;
import org.junit.Test;
import org.mockito.Mockito;

public class ServicioActualizarAlquilerVehiculoTest {

    @Test
    public void validarAlquilerExistenciaPreviaTest() {
        // arrange
        AlquilerVehiculo alquilerVehiculo = new AlquilerVehiculoTestDataBuilder().conId(1L).build();
        RepositorioAlquilerVehiculo repositorioAlquilerVehiculo = Mockito.mock(RepositorioAlquilerVehiculo.class);
        Mockito.when(repositorioAlquilerVehiculo.existe(Mockito.anyLong())).thenReturn(true);

        ServicioActualizarAlquilerVehiculo servicioActualizarAlquilerVehiculo = new ServicioActualizarAlquilerVehiculo(repositorioAlquilerVehiculo);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarAlquilerVehiculo.ejecutar(alquilerVehiculo), ExcepcionDuplicidad.class,"El alquiler ya existe en el sistema");
    }
}
