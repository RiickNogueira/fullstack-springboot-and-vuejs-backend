package com.richardson.springbootapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richardson.springbootapi.model.Perfil;
import com.richardson.springbootapi.repository.PerfilRepository;
import com.richardson.springbootapi.service.exception.ObjectNotFoundException;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository repo;

	public Perfil find(Integer id) {
		Optional<Perfil> obj = repo.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Não foi encontrado nenhum perfil com este Id (" + id + ")"));
	}

	public List<Perfil> findAll() {
		return repo.findAllByOrderByNomeAsc();
	}

	public Perfil create(Perfil obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Perfil update(Perfil updatedObj) {
		Perfil obj = find(updatedObj.getId());
		obj.setNome(updatedObj.getNome());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		repo.deleteById(find(id).getId());
	}

}
