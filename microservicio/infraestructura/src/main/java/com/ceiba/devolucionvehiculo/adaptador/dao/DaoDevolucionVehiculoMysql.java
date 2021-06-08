package com.ceiba.devolucionvehiculo.adaptador.dao;

import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.dao.DaoDevolucionVehiculo;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;

import java.util.List;

public class DaoDevolucionVehiculoMysql implements DaoDevolucionVehiculo {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="devolucionesVehiculos", value="listar")
    private static String sqlListar;

    public DaoDevolucionVehiculoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoDevolucionVehiculo> listar() {
        return null;
    }
}
