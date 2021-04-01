 CREATE TABLE perfis_usuarios (
  perfil_id INT NOT NULL,
  usuario_id INT NOT NULL,
  INDEX perfil_idx (perfil_id ASC),
  INDEX usuario_idx (usuario_id ASC),
  CONSTRAINT perfis_usuarios_perfil_fk
    FOREIGN KEY (perfil_id)
    REFERENCES perfis (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT perfis_usuarios_usuario_fk
    FOREIGN KEY (usuario_id)
    REFERENCES usuarios (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
 
 
  
