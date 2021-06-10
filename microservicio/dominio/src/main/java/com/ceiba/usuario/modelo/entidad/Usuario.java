package com.ceiba.usuario.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.*;

@Getter
public class Usuario {

    private static final String LA_CEDULA_DEBE_TENER_UNA_LONGITUD_MINIMA = "La cedula debe tener una longitud mayor o igual a %s";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA = "Se debe ingresar la cedula";
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "Se debe ingresar el nombre de usuario";

    private static final int LONGITUD_MINIMA_CEDULA = 8;

    private Long id;
    private String nombre;
    private String cedula;


    public Usuario(Long id,String nombre, String cedula) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        validarObligatorio(cedula, SE_DEBE_INGRESAR_LA_CEDULA);
        validarLongitudMinima(cedula, LONGITUD_MINIMA_CEDULA, String.format(LA_CEDULA_DEBE_TENER_UNA_LONGITUD_MINIMA,LONGITUD_MINIMA_CEDULA));


        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;

    }

}
