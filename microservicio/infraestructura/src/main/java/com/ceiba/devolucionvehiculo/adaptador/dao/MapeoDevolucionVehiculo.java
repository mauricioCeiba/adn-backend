package com.ceiba.devolucionvehiculo.adaptador.dao;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoDevolucionVehiculo implements RowMapper<DtoDevolucionVehiculo>, MapperResult {

    @Override
    public DtoDevolucionVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long idDevolucion = resultSet.getLong("id_devolucion");
        Date fechaEntrega = resultSet.getDate("fecha_entrega_devolucion");
        int porcentajeDeDano = resultSet.getInt("porcentaje_dano_devolucion");


        Long idVehiculo = resultSet.getLong("id_vehiculo");
        String placa = resultSet.getNString("placa");
        double  precioAlquilerPorDia = resultSet.getDouble("precio_alquiler_dia");
        String tipoVehiculo = resultSet.getNString("tipo_vehiculo");
        Vehiculo vehiculo = new Vehiculo(idVehiculo,placa,precioAlquilerPorDia,tipoVehiculo);

        Long idUsuario = resultSet.getLong("id_usuario");
        String nombre = resultSet.getNString("nombre_usuario");
        String cedula = resultSet.getNString("cedula_usuario");
        Usuario usuario = new Usuario(idUsuario,nombre,cedula);

        Long idAlquiler = resultSet.getLong("id_alquiler");
        int cantidadDiasAlquiler = resultSet.getInt("cantidad_dias_alquiler");
        Date fechaAlquiler = resultSet.getDate("fecha_alquiler");
        AlquilerVehiculo alquilerVehiculo = new AlquilerVehiculo(idAlquiler,vehiculo,usuario,cantidadDiasAlquiler,fechaAlquiler);

        return new DtoDevolucionVehiculo(idDevolucion,alquilerVehiculo,fechaEntrega,porcentajeDeDano);
    }
}
