package com.ceiba.devolucionvehiculo.adaptador.dao;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoDevolucionVehiculo implements RowMapper<DtoDevolucionVehiculo>, MapperResult {

    @Override
    public DtoDevolucionVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        AlquilerVehiculo alquilerVehiculo =(AlquilerVehiculo) resultSet.getObject("alquilerVehiculo");
        Date fechaEntrega = resultSet.getDate("fechaEntrega");
        int porcentajeDeDano = resultSet.getInt("porcentajeDeDano");

        return new DtoDevolucionVehiculo(id,alquilerVehiculo,fechaEntrega,porcentajeDeDano);
    }
}
