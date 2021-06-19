package com.ceiba.alquilervehiculo.adaptador.dao;

import com.ceiba.alquilervehiculo.modelo.dto.DtoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.modelo.tipo.TipoVehiculo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class MapeoAlquilerVehiculo implements RowMapper<DtoAlquilerVehiculo>, MapperResult {

    @Override
    public DtoAlquilerVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Long id = resultSet.getLong("id");
        int cantidadDiasAlquiler = resultSet.getInt("cantidad_dias_alquiler");
        double valorTotalParcial = resultSet.getDouble("valor_total_parcial");
        LocalDate fechaAlquiler = resultSet.getDate("fecha_alquiler").toLocalDate();
        Long idUSuario = resultSet.getLong("USUARIOS_id");
        Long idVehiculo = resultSet.getLong("VEHICULOS_id");
        return new DtoAlquilerVehiculo(id,idVehiculo,idUSuario,cantidadDiasAlquiler,valorTotalParcial,fechaAlquiler);
    }




}
