drop table estructuras;

create table estructuras (
str_id int4 not null primary key generated by default as IDENTITY  (start with 1) unique,
str_tipo VARCHAR(255) not null,
str_nombre varchar(255) unique not null,
str_eje int4 not null ,
str_ubicacion varchar(255),
str_ancho numeric(3,2),
str_alto numeric(3,2)
);