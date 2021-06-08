update devolucionvehiculo
set alquilerVehiculo = :alquilerVehiculo,
	fechaEntrega = :fechaEntrega,
	porcentajeDeDano = :porcentajeDeDano,
	valorPorMora = :valorPorMora,
	valorPorDanos = :valorPorDanos,
	valorTotalAPagar = :valorTotalAPagar
where id = :id