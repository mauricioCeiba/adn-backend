update devolucion_vehiculos
set alquiler_vehiculos_id = :idAlquilerVehiculos,
	fecha_entrega = :fechaEntrega,
	porcentaje_de_dano = :porcentajeDeDano,
	valor_por_mora = :valorPorMora,
	valor_por_danos = :valorPorDanos,
	valor_total_a_pagar = :valorTotalAPagar
where id = :id