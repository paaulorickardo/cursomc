package com.pauloricardo.crusomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.crusomc.domain.Categoria;
import com.pauloricardo.crusomc.repositories.CategoriaRepository;
import com.pauloricardo.crusomc.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {
		
		@Autowired  //automaticamente instancia o SpringBoot
		private CategoriaRepository repo;
		
		public Categoria find(Integer id) {
			Optional<Categoria> obj = repo.findById(id); // busca no banco de dados
			return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
			
	}
		
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
		
}
