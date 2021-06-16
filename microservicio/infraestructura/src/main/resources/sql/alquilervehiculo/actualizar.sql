update alquiler_vehiculos
set cantidad_dias_alquiler = :cantidadDiasAlquiler,
	valor_total_parcial = :valorTotalParcial,
	fecha_alquiler = :fechaAlquiler,
	USUARIOS_id = :usuariosId,
	VEHICULOS_id = :vehiculosId
where id = :id