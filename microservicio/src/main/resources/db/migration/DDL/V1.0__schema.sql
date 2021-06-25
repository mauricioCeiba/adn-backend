
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `cedula` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `vehiculos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(45) NOT NULL,
  `precio_alquiler_dia` VARCHAR(45) NOT NULL,
  `tipo_vehiculo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `alquiler_vehiculos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cantidad_dias_alquiler` INT NOT NULL,
  `valor_total_parcial` DOUBLE NOT NULL,
  `fecha_alquiler` DATE NOT NULL,
  `USUARIOS_id` INT NOT NULL,
  `VEHICULOS_id` INT NOT NULL,

   primary key (id)


  );

  Alter table alquiler_vehiculos ADD FOREIGN KEY (USUARIOS_id) REFERENCES usuarios(id);
  Alter table alquiler_vehiculos ADD FOREIGN KEY (VEHICULOS_id) REFERENCES vehiculos(id);




CREATE TABLE IF NOT EXISTS `devolucion_vehiculos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fecha_entrega` DATE NOT NULL,
  `porcentaje_de_dano` INT NOT NULL,
  `valor_por_mora` DOUBLE NOT NULL,
  `valor_por_danos` DOUBLE NOT NULL,
  `valor_total_a_pagar` DOUBLE NOT NULL,
  `ALQUILER_VEHICULOS_id` INT NOT NULL,
     primary key (id)

  );
  Alter table devolucion_vehiculos ADD FOREIGN KEY (ALQUILER_VEHICULOS_id) REFERENCES alquiler_vehiculos(id);







