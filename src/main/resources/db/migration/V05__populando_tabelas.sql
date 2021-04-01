INSERT INTO cargos (nome) VALUES ('Desenvolvedor Full Stack');
INSERT INTO cargos (nome) VALUES ('Desenvolvedor Java Pleno');
INSERT INTO cargos (nome) VALUES ('Desenvolvedor Java Sênior');
INSERT INTO cargos (nome) VALUES ('Analista de Requisitos');
INSERT INTO cargos (nome) VALUES ('Administrador de Banco de Dados');

INSERT INTO perfis (nome) VALUES ('Super Usuário');
INSERT INTO perfis (nome) VALUES ('Administrador');
INSERT INTO perfis (nome) VALUES ('Telemarketing');
INSERT INTO perfis (nome) VALUES ('Financeiro');

INSERT INTO usuarios (nome, cpf, data_nascimento, sexo, cargo_id, criado_em) VALUES ('Richardson Nogueira', '095.856.714-09', '1993-01-25', 'M', '1', '2021-03-31 21:25:00');

INSERT INTO perfis_usuarios (perfil_id, usuario_id) VALUES ('1', '1');
INSERT INTO perfis_usuarios (perfil_id, usuario_id) VALUES ('2', '1');

