package com.ceiba.devolucionvehiculo.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

import static com.ceiba.dominio.ValidadorArgumento.validarFechas;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class DevolucionVehiculo {

    private Long id;
    private Long idAlquilerVehiculos;
    private LocalDate fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;

    private static final String SE_DEBE_INGRESAR_VALOR_por_DANOS= "Se debe ingresaar el valor  por danos";
    private static final String SE_DEBE_INGRESAR_VALOR_DE_MORA = "Se debe ingresaar el valor por mora";
    private static final String SE_DEBE_CALCULAR_EL_VALOR_A_PAGAR = "Se debe calcular el valor a pagar";
    private static final String EL_ID_DEL_ALQUILERVEHICULO_NO_PUEDE_SER_NULL= "El id del alquiler vehiculo no pude ser nulo";
    private static final String LA_FECHA_NO_PUEDE_SER_NULA="La fecha no puede ser nula";


    public DevolucionVehiculo(Long id,Long idAlquilerVehiculos, LocalDate fechaEntrega,int porcentajeDeDano){

      validarObligatorio(idAlquilerVehiculos, EL_ID_DEL_ALQUILERVEHICULO_NO_PUEDE_SER_NULL);
      validarFechas(fechaEntrega,LA_FECHA_NO_PUEDE_SER_NULA);
      validarObligatorio(porcentajeDeDano,SE_DEBE_INGRESAR_VALOR_DE_MORA);

        this.idAlquilerVehiculos = idAlquilerVehiculos;
        this.fechaEntrega = fechaEntrega;
        this.porcentajeDeDano = porcentajeDeDano;


        validarObligatorio((valorTotalAPagar), SE_DEBE_CALCULAR_EL_VALOR_A_PAGAR);


    }


}
