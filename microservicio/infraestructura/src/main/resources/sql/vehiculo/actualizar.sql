update vehiculos
set placa = :placa,
	precio_alquiler_dia = :precioAlquilerPorDia,
	tipo_vehiculo = :tipoVehiculo
where id = :id