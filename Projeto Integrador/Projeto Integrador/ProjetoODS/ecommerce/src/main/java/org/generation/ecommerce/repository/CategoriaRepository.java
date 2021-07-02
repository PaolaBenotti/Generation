package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public Optional<CategoriaModel>  findByResiduoContainingIgnoreCase(String residuo);

}