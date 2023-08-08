drop database if exists Hackaton;

create database Hackaton;

use Hackaton;

create table Categoria(
	idcategoria int primary key auto_increment,
    nombre varchar(50) not null,
    descripcion varchar(50) not null,
    estado boolean not null
);

create table Cupon(
	idcupon int primary key auto_increment,
    codigo varchar(100) not null,
    descripcion varchar(100) not null,
    descuento double not null,
    estado boolean not null
);

create table EstadoPedido(
	idEstado int primary key auto_increment,
    descripcion varchar(100) not null,
    estado boolean not null
);

create table Cliente(
	idcliente int primary key auto_increment,
    username varchar(50) not null,
    email varchar(100) not null,
    password varchar(50) not null,
    estado boolean not null
);

create table Producto(
	idproducto int primary key auto_increment,
    idcategoria int not null,
    nombre  varchar(50) not null,
    descripcion varchar(200),
    igv boolean not null,
    imagen varchar(100) not null,
    descuento double not null,
    iamgen1 varchar(100) not null,
    estado_p boolean not null,
    constraint foreign key (idcategoria) references categoria(idcategoria)
);

create table Pedido(
	idpedido int primary key auto_increment,
    fecha Date not null,
    subtotal double not null,
    igv double not null,
    total double not null,
    idcliente int not null,
    idEstado int not null,
    idcupon int not null,
    constraint foreign key (idcliente) references Cliente(idcliente),
    constraint foreign key (idEstado) references EstadoPedido(idEstado), 
    constraint foreign key (idcupon) references cupon(idcupon)
);

create table Detallepedido(
	iddetalle int primary key auto_increment,
    idpedido int not null,
    idproducto int not null,
    cantidad double not null,
    subtotal double not null,
	constraint foreign key (idpedido) references Pedido(idpedido),
    constraint foreign key (idproducto) references Producto(idproducto)
);


INSERT INTO `hackaton`.`categoria`
(`nombre`,
`descripcion`,
`estado`)
VALUES
("Polos",
"Polos de todas las tallas y colores",
1);


INSERT INTO `hackaton`.`cliente`
(
`username`,
`email`,
`password`,
`estado`)
VALUES
(
"PieroXD",
"PieroMartell@gmail.com",
"pierom689",
1);

INSERT INTO `hackaton`.`cupon`
(`codigo`,
`descripcion`,
`descuento`,
`estado`)
VALUES
(
"SM001",
"Cupon de Descuento para Comprar Polos",
12,
1);

INSERT INTO `hackaton`.`EstadoPedido`
(
`descripcion`,
`estado`)
VALUES
("Activo",1);

INSERT INTO `hackaton`.`producto`
(`idcategoria`,
`nombre`,
`descripcion`,
`igv`,
`imagen`,
`descuento`,
`iamgen1`,
`estado_p`)
VALUES
(
1,
"Polo Rosado",
"Es un Polo Rosado",
1,
"Imagen01",
10,
"Imagen02",
1);


INSERT INTO `hackaton`.`pedido`
(`fecha`,
`subtotal`,
`igv`,
`total`,
`idcliente`,
`idEstado`,
`idcupon`)
VALUES
("2022/01/01",
12.5,
0.5,
12,
1,
1,
1);

INSERT INTO `hackaton`.`Detallepedido`
(`idpedido`,
`idproducto`,
`cantidad`,
`subtotal`)
VALUES
(1,
1,
20,
12);


select * from estadopedido;
select * from pedido;
Select * from Categoria;
select * from Estado







