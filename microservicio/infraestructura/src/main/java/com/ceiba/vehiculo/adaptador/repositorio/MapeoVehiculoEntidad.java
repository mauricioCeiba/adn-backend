package com.ceiba.vehiculo.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoVehiculoEntidad implements RowMapper<Vehiculo>, MapperResult {

    @Override
    public Vehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String placa = resultSet.getString("placa");
        double precioAlquilerPorDia= resultSet.getDouble("precio_alquiler_dia");
        String tipoVehiculo = resultSet.getString("tipo_vehiculo");


            return new Vehiculo(id,placa,precioAlquilerPorDia,tipoVehiculo);
        }





}
