package com.pauloricardo.crusomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.crusomc.domain.Pedido;
import com.pauloricardo.crusomc.repositories.PedidoRepository;
import com.pauloricardo.crusomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {
		
		@Autowired  //automaticamente instancia o SpringBoot
		private PedidoRepository repo;
		
		public Pedido find(Integer id) {
			Optional<Pedido> obj = repo.findById(id); // busca no banco de dados
			return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
			
	}
}
