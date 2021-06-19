package com.ceiba.alquilervehiculo.adaptador.repositorio;


import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class MapeoAlquilerVehiculoEntidad implements RowMapper<AlquilerVehiculo>, MapperResult {

    @Override
    public AlquilerVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Long vehiculosId = resultSet.getLong("VEHICULOS_id");
        Long usuariosId = resultSet.getLong("USUARIOS_id");
        int cantidadDiasAlquiler = resultSet.getInt("cantidad_dias_alquiler");
        LocalDate fechaAlquiler = resultSet.getDate("fecha_alquiler").toLocalDate();
        Double valorTotalParcial= resultSet.getDouble("valor_total_parcial");

            return new AlquilerVehiculo(id,vehiculosId,usuariosId,cantidadDiasAlquiler,fechaAlquiler,valorTotalParcial);
        }





}
