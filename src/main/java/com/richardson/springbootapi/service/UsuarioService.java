package com.richardson.springbootapi.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richardson.springbootapi.model.Usuario;
import com.richardson.springbootapi.repository.UsuarioRepository;
import com.richardson.springbootapi.service.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	public Usuario find(Integer id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Não foi encontrado nenhum usuário com este Id (" + id + ")"));
	}

	public List<Usuario> findAll() {
		return repo.findAllByOrderByNomeAsc();
	}

	public Usuario create(Usuario obj) {
		obj.setId(null);
		obj.setCriadoEm(LocalDateTime.now());
		return repo.save(obj);
	}

	public Usuario update(Usuario updatedObj) {
		Usuario obj = find(updatedObj.getId());
		obj.setCargo(updatedObj.getCargo());
		obj.setCpf(updatedObj.getCpf());
		obj.setDataNascimento(updatedObj.getDataNascimento());
		obj.setNome(updatedObj.getNome());
		obj.setPerfis(updatedObj.getPerfis());
		obj.setSexo(updatedObj.getSexo());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		repo.deleteById(find(id).getId());
	}

}
