package org.generation.MinhaLojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.generation.MinhaLojaDeGames.Categoria.Produto;

@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByDescricaoContainingIgnoreCase (String nome);
}