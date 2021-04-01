package com.richardson.springbootapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richardson.springbootapi.model.Cargo;
import com.richardson.springbootapi.repository.CargoRepository;
import com.richardson.springbootapi.service.exception.ObjectNotFoundException;

@Service
public class CargoService {

	@Autowired
	private CargoRepository repo;

	public Cargo find(Integer id) {
		Optional<Cargo> obj = repo.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Não foi encontrado nenhum cargo com este Id (" + id + ")"));
	}

	public List<Cargo> findAll() {
		return repo.findAllByOrderByNomeAsc();
	}

	public Cargo create(Cargo obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Cargo update(Cargo updatedObj) {
		Cargo obj = find(updatedObj.getId());
		obj.setNome(updatedObj.getNome());
		return repo.save(obj);
	}

}
