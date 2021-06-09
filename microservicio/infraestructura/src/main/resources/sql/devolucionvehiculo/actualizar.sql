update devolucion_vehiculos
set alquiler_vehiculos_id = :alquiler_vehiculos_id,
	fechaEntrega = :fechaEntrega,
	porcentajeDeDano = :porcentajeDeDano,
	valorPorMora = :valorPorMora,
	valorPorDanos = :valorPorDanos,
	valorTotalAPagar = :valorTotalAPagar
where id = :id