package com.pauloricardo.crusomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pauloricardo.crusomc.domain.ItemPedido;
// é capaz de buscar vários objetos do Banco de Dados referentes a Categoria (Camada de acesso a dados)
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
}
