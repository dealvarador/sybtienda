create table acreedorestb(
id bigint not null auto_increment,
fecha datetime not null,
producto varchar(100) not null,
compra double not null,
pago double not null,
idcliente int not null,
operacion double not null,
primary key(id)
);