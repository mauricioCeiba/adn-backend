package com.ceiba.alquilervehiculo.adaptador.dao;

import com.ceiba.alquilervehiculo.modelo.dto.DtoAlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.modelo.tipo.TipoVehiculo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoAlquilerVehiculo implements RowMapper<DtoAlquilerVehiculo>, MapperResult {

    @Override
    public DtoAlquilerVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id_alquiler");

        int cantidadDiasAlquiler = resultSet.getInt("cantidad_dias_alquiler");
        double valorTotalParcial = resultSet.getDouble("valor_total_parcial");
        Date fechaAlquiler = resultSet.getDate("fecha_alquiler");

        Long idVehiculo = resultSet.getLong("id_vehiculo");
        String placa = resultSet.getNString("placa");
        double  precioAlquilerPorDia = resultSet.getDouble("precio_alquiler_dia");
        String tipoVehiculo = resultSet.getNString("tipo_vehiculo");
        Vehiculo vehiculo = new Vehiculo(idVehiculo,placa,precioAlquilerPorDia,tipoVehiculo);

        Long idUsuario = resultSet.getLong("id_usuario");
        String nombre = resultSet.getNString("nombre_usuario");
        String cedula = resultSet.getNString("cedula_usuario");
        Usuario usuario = new Usuario(idUsuario,nombre,cedula);

        return new DtoAlquilerVehiculo(id,vehiculo,usuario,cantidadDiasAlquiler,valorTotalParcial,fechaAlquiler);
    }

}
