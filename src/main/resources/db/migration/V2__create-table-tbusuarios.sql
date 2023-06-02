create table tbusuarios(
id bigint not null auto_increment,
nombre varchar(100) not null,
usuario varchar(30) not null,
password varchar(40) not null,
estado varchar(8) not null,
primary key(id)
);