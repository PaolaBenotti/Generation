package org.generation.ecommerce.repository;

import java.util.List;

import org.generation.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);

}