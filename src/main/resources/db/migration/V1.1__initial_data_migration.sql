INSERT INTO `rol`
    (`id`, `name`)
VALUES
    (1, 'ROLE_ADMIN'),
    (2, 'ROLE_AGENTE'),
    (3, 'ROLE_ANALISTA');

INSERT INTO `user`
    (`id`,`email`,`fullname`,`password`,`rol_id`)
VALUES
    (1, 'admin@minitasdecorazon.com', 'Wilmer', '$2a$12$48wdEpJlAPnLKuJUJnffoukewiCWshiOMTMNjipKU43fHdHNJ7DOa', 1),
    (2, 'agente@minitasdecorazon.com', 'Andres', '$2a$12$q692o6oEZwti6YL0K6/LCO3RZFx2L5Ddc/cQ2JU5EcYtPD3ViWVYy', 2),
    (3, 'agente2@minitasdecorazon.com', 'Jairo', '$2a$12$GSVxiKKbeDl2ee33/2G5Wev4O7ooC7eTZmmaRmoDVGwlXI9jmaj4u', 2),
    (4, 'analista@minitasdecorazon.com', 'Carlos', '$2a$12$spokoGm/xlzS7F8NeFmAWuijzyPG3WhAQ5UqmD7TDYaLFLlkHBKai', 3);

INSERT INTO `desminado`
    (`id`,`ubicacion`,`region`,`desminado`,`agente`)
VALUES
    (1, 'Corregimiento sin minas', 'Neiva', 'Militar', 'Andres'),
   (2, 'Vereda sin minas', 'Villavicencio', 'Humanitario', 'Jairo');