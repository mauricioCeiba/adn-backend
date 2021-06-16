package com.ceiba.vehiculo.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.vehiculo.modelo.dto.DtoVehiculo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoVehiculo implements RowMapper<DtoVehiculo>, MapperResult {

    @Override
    public DtoVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String placa = resultSet.getString("placa");
        double precioAlquilerPorDia = resultSet.getDouble("precio_alquiler_dia");
        String tipoVehiculo =  resultSet.getString("tipo_vehiculo");

        return new DtoVehiculo(id,placa,precioAlquilerPorDia,tipoVehiculo);
    }
}
