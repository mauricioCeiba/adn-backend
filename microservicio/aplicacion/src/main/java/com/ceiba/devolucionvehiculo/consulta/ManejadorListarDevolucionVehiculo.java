package com.ceiba.devolucionvehiculo.consulta;

import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.dao.DaoDevolucionVehiculo;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import com.ceiba.usuario.puerto.dao.DaoUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarDevolucionVehiculo {

    private final DaoDevolucionVehiculo daoDevolucionVehiculo;

    public ManejadorListarDevolucionVehiculo(DaoDevolucionVehiculo daoDevolucionVehiculo){
        this.daoDevolucionVehiculo = daoDevolucionVehiculo;
    }

    public List<DtoDevolucionVehiculo> ejecutar(){ return this.daoDevolucionVehiculo.listar(); }
}
