package org.generation.Farmacia.Repository;

import java.util.List;

import org.generation.Farmacia.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);

}