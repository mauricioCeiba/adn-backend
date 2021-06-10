select devolucion_vehiculos.id as id_devolucion, devolucion_vehiculos.fecha_entrega as fecha_entrega_devolucion, devolucion_vehiculos.porcentaje_de_dano as porcentaje_dano_devolucion,
vehiculos.id as id_vehiculo, vehiculos.placa as placa, vehiculos.precio_alquiler_dia as precio_alquiler_dia, vehiculos.tipo_vehiculo as tipo_vehiculo,
usuarios.id as id_usuario, usuarios.nombre as nombre_usuario,usuarios.cedula as cedula_usuario
from devolucion_vehiculos
 inner join alquiler_vehiculos on devolucion_vehiculos.ALQUILER_VEHICULOS_id=alquiler_vehiculos.id
inner join vehiculos on alquiler_vehiculos.VEHICULOS_id=vehiculos.id
inner join usuarios on alquiler_vehiculos.USUARIOS_id=usuarios.id