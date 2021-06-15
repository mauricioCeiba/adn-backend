update alquiler_vehiculos
set cantidad_dias_alquiler = :cantidadDiasAlquiler,
	valor_total_parcial = :valorTotalParcial,
	fecha_alquiler = :fechaAlquiler,
	USUARIOS_id = :USUARIOS_id,
	VEHICULOS_id = :VEHICULOS_id
where id = :id