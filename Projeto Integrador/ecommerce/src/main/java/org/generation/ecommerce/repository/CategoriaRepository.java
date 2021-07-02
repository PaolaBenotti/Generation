package org.generation.ecommerce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.generation.ecommerce.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
		public List<CategoriaModel> findByResiduoContainingIgnoreCase(String residuo);
	
}


