package com.richardson.springbootapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richardson.springbootapi.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
	public List<Perfil> findAllByOrderByNomeAsc();
}
