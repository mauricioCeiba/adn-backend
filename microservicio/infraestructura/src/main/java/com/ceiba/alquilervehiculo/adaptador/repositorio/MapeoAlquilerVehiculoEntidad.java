package com.ceiba.alquilervehiculo.adaptador.repositorio;


import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoAlquilerVehiculoEntidad implements RowMapper<AlquilerVehiculo>, MapperResult {

    @Override
    public AlquilerVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Long VEHICULOS_id = resultSet.getLong("VEHICULOS_id");
        Long USUARIOS_id = resultSet.getLong("USUARIOS_id");
        int cantidadDiasAlquiler = resultSet.getInt("cantidad_dias_alquiler");
        double valorTotalParcial = resultSet.getDouble("valor_total_parcial");
        Date fechaAlquiler = resultSet.getDate("fecha_alquiler");

            return new AlquilerVehiculo(id,VEHICULOS_id,USUARIOS_id,cantidadDiasAlquiler,fechaAlquiler);
        }





}
