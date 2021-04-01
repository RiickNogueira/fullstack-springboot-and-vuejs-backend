 CREATE TABLE usuarios (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(150) NOT NULL,
  cpf VARCHAR(14) NOT NULL,
  data_nascimento DATE NULL,
  sexo VARCHAR(1) NULL,
  cargo_id INT NOT NULL,
  criado_em TIMESTAMP NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX usuario_cpf_UNIQUE (cpf ASC),
  INDEX cargo_IDX (cargo_id ASC),
  CONSTRAINT cargos_usuarios_cargo_fk
    FOREIGN KEY (cargo_id)
    REFERENCES cargos (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
 
  
