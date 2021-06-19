package com.ceiba.devolucionvehiculo.adaptador.repositrio;


import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class MapeoDevolucionVehiculoEntidad implements RowMapper<DevolucionVehiculo>, MapperResult {

    @Override
    public DevolucionVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Long idAlquilerVehiculos = resultSet.getLong("ALQUILER_VEHICULOS_id");
        LocalDate fechaEntrega = resultSet.getDate("fecha_entrega").toLocalDate();
        int porcentajeDeDano = resultSet.getInt("porcentaje_de_dano");
        double valorPorMora = resultSet.getDouble("valor_por_mora");
        double valorPorDanos = resultSet.getDouble("valor_por_danos");
        double valorTotalAPagar = resultSet.getDouble("valor_total_a_pagar");


            return new DevolucionVehiculo(id,idAlquilerVehiculos,fechaEntrega,porcentajeDeDano);
        }





}
