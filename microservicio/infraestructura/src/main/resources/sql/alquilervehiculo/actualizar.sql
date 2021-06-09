update alquiler_vehiculo
set cantidad_dias_alquiler = :cantidad_dias_alquiler,
	valor_total_parcial = :valor_total_parcial,
	fecha_alquiler = :fecha_alquiler,
	USUARIOS_id = :USUARIOS_id,
	VEHICULOS_id = :VEHICULOS_id
where id = :id