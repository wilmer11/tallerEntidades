create table IF NOT EXISTS `rol` (
  `id` bigint not null auto_increment,
  `name` varchar(255) not null,
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table IF NOT EXISTS `user` (
  `id` bigint not null auto_increment,
  `email` varchar(1500) not null,
  `fullname` varchar(20) not null,
  `password` varchar(255) not null,
  `rol_id` int not null,
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table IF NOT EXISTS `desminado` (
  `id` bigint not null auto_increment,
  `ubicacion` varchar(200) not null,
  `region` varchar(200) not null,
  `desminado` varchar(200) not null,
  `agente` varchar(200) not null,
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table IF NOT EXISTS `users_roles` (
  `user_id` bigint not null,
  `rol_id` bigint not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;