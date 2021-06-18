package com.ceiba.devolucionvehiculo.modelo.entidad;


import lombok.Getter;
import lombok.Setter;
import java.util.Date;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class DevolucionVehiculo {

    private Long id;
    private Long idAlquilerVehiculos;
    private Date fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;

    private static final String SE_DEBE_CALCULAR_EL_VALOR_A_PAGAR = "Se debe calcular el valor a pagar";


    public DevolucionVehiculo(Long id,Long idAlquilerVehiculos, Date fechaEntrega,int porcentajeDeDano){
        this.idAlquilerVehiculos = idAlquilerVehiculos;
        this.fechaEntrega = fechaEntrega;
        this.porcentajeDeDano = porcentajeDeDano;


        validarObligatorio((valorTotalAPagar), SE_DEBE_CALCULAR_EL_VALOR_A_PAGAR);


    }


}
