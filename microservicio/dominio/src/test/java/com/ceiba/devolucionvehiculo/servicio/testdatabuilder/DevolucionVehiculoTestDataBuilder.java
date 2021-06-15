package com.ceiba.devolucionvehiculo.servicio.testdatabuilder;


import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;


import java.util.Date;

public class DevolucionVehiculoTestDataBuilder {

    private Long id;
    private Long id_alquilerVehiculo;
    private Date fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;


    public DevolucionVehiculoTestDataBuilder() {


        id_alquilerVehiculo=1L;
        Date fechaAlquiler= new Date(121,5,10);
        fechaEntrega = new Date(121,5,14);;
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
