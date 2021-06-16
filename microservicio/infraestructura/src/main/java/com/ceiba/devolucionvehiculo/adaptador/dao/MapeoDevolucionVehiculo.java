package com.ceiba.devolucionvehiculo.adaptador.dao;


import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoDevolucionVehiculo implements RowMapper<DtoDevolucionVehiculo>, MapperResult {

    @Override
    public DtoDevolucionVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long idDevolucion = resultSet.getLong("id");
        Date fechaEntrega = resultSet.getDate("fecha_entrega");
        int porcentajeDeDano = resultSet.getInt("porcentaje_de_dano");
        double valorPorMora = resultSet.getDouble("valor_por_mora");
        double valorPorDanos = resultSet.getDouble("valor_por_danos");
        double valorTotalAPagar = resultSet.getDouble("valor_total_a_pagar");
        Long ALQUILER_VEHICULOS_id = resultSet.getLong("ALQUILER_VEHICULOS_id");

        return new DtoDevolucionVehiculo(idDevolucion, ALQUILER_VEHICULOS_id, fechaEntrega,porcentajeDeDano,valorPorMora,valorPorDanos,valorTotalAPagar);
    }
}
