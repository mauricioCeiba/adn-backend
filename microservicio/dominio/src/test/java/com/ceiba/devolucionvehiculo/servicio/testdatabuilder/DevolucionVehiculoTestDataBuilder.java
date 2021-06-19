package com.ceiba.devolucionvehiculo.servicio.testdatabuilder;


import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;


import java.time.LocalDate;


public class DevolucionVehiculoTestDataBuilder {

    private Long id;
    private Long id_alquilerVehiculo;
    private LocalDate fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;


    public DevolucionVehiculoTestDataBuilder() {


        id_alquilerVehiculo=1L;
        LocalDate fechaAlquiler=  LocalDate.of(2021,6,10);
        fechaEntrega =  LocalDate.of(2021,6,14);;
        porcentajeDeDano =11;

    }

    public DevolucionVehiculoTestDataBuilder conPorcentajeDeDano(int porcentajeDeDano) {
        this.porcentajeDeDano = porcentajeDeDano;
        return this;
    }

    public DevolucionVehiculoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public DevolucionVehiculo build() {
        return new DevolucionVehiculo(id,id_alquilerVehiculo, fechaEntrega,porcentajeDeDano);
    }
}
