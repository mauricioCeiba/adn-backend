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

        Long id = resultSet.getLong("id");

        Long id_vehiculo = resultSet.getLong("VEHICULOS_ID");
        String placaVehiculo = resultSet.getString("placa");
        double precioAlquilerDiaVehiculo = resultSet.getDouble("precio_alquiler_dia");
        String tipo=  resultSet.getString("tipo_vehiculo");
        TipoVehiculo tipoVehiculo;
        if(tipo=="CARRO"){
            tipoVehiculo = TipoVehiculo.CARRO;
        }else
        {
            tipoVehiculo = TipoVehiculo.MOTO;
        }
        Vehiculo vehiculo= new Vehiculo(id_vehiculo,placaVehiculo,precioAlquilerDiaVehiculo,tipoVehiculo);

        Long id_usuario = resultSet.getLong("USUARIOS_ID");
        String nombre = resultSet.getString("nombre");
        String cedula = resultSet.getString("cedula");
        Usuario usuario= new Usuario(id_usuario,nombre,cedula);

        int cantidadDiasAlquiler = resultSet.getInt("cantidad_dias_alquiler");
        double valorTotalParcial = resultSet.getDouble("valor_total_parcial");
        Date fechaAlquiler = resultSet.getDate("fecha_alquiler");


        return new DtoAlquilerVehiculo(id,vehiculo,usuario,cantidadDiasAlquiler,valorTotalParcial,fechaAlquiler);
    }

}
