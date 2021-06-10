
select alquiler_vehiculos.id as id_alquiler, vehiculos.id as id_vehiculo, vehiculos.placa as placa,vehiculos.precio_alquiler_dia as precio_alquiler_dia,
vehiculos.tipo_vehiculo as tipo_vehiculo,
usuarios.id as id_usuario, usuarios.nombre as nombre_usuario,usuarios.cedula as cedula_usuario ,valor_total_parcial,fecha_alquiler,USUARIOS_id,VEHICULOS_id
from alquiler_vehiculos inner join vehiculos on alquiler_vehiculos.VEHICULOS_id=VEHICULOS_id inner join usuarios on alquiler_vehiculos.USUARIOS_id=usuarios.id