package com.pauloricardo.crusomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.crusomc.domain.Cliente;
import com.pauloricardo.crusomc.repositories.ClienteRepository;
import com.pauloricardo.crusomc.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
		
		@Autowired  //automaticamente instancia o SpringBoot
		private ClienteRepository repo;
		
		public Cliente find(Integer id) {
			Optional<Cliente> obj = repo.findById(id); // busca no banco de dados
			return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
			
	}
}
