package com.richardson.springbootapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richardson.springbootapi.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
	public List<Cargo> findAllByOrderByNomeAsc();

	public Optional<Cargo> findByNome(String string);
}
