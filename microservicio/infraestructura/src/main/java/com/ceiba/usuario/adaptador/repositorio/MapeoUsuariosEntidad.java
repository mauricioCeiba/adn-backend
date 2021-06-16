package com.ceiba.usuario.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.entidad.Usuario;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MapeoUsuariosEntidad implements RowMapper<Usuario>, MapperResult {

    @Override
    public Usuario mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getNString("nombre");
        String cedula = resultSet.getNString("cedula");


            return new Usuario(id,nombre,cedula);
        }





}
