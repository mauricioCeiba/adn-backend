package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Usuario;

import java.time.LocalDateTime;

public class UsuarioTestDataBuilder {

    private Long id;
    private String nombreUsuario;
    private String cedula;


    public UsuarioTestDataBuilder() {
        nombreUsuario = "1234";
        cedula = "1234";

    }

    public UsuarioTestDataBuilder conClave(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public UsuarioTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public Usuario build() {
        return new Usuario(id,nombreUsuario, cedula);
    }
}
