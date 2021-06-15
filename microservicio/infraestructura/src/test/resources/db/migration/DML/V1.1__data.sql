insert into usuarios(nombre,cedula) values('test','123456783');
insert into usuarios(id,nombre,cedula) values(2,'test2','22123456783');

insert into vehiculos(placa,precio_alquiler_dia,tipo_vehiculo) values('HCX918',100000,'CARRO');
insert into vehiculos(id,placa,precio_alquiler_dia,tipo_vehiculo) values(3,'YY987x',20000,'CARRO');

insert into alquiler_vehiculos(cantidad_dias_alquiler,valor_total_parcial,fecha_alquiler,USUARIOS_id,VEHICULOS_id)
values (5,200000,sysdate(),1,1);

insert into devolucion_vehiculos (id,fecha_entrega,porcentaje_de_dano,valor_por_mora,valor_por_danos,valor_total_a_pagar,ALQUILER_VEHICULOS_id)
values(1,sysdate(),11,2000,2000,20000,1);