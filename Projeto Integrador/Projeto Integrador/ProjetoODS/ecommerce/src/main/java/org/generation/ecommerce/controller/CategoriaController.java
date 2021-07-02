package org.generation.ecommerce.controller;



import javax.validation.Valid;

import org.generation.ecommerce.model.CategoriaModel;
import org.generation.ecommerce.repository.CategoriaRepository;
import org.generation.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	@Autowired
	private CategoriaRepository repository;

	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(categoriaService.findAll());
	}
	
	@GetMapping("/residuo/buscar/{id}")
	public ResponseEntity<?> findById(@Valid @PathVariable Long id) {
		return ResponseEntity.ok(repository.findById(id));
	}

	@GetMapping("/residuo/buscar/residuo/{residuo}")
	public ResponseEntity<?> findByResiduo(@Valid @PathVariable String residuo) {
		return ResponseEntity.ok(repository.findByResiduoContainingIgnoreCase(residuo));
	}

	@PostMapping("/residuo/cadastro")
	public ResponseEntity<?> cadastroResiduo(@Valid @RequestBody CategoriaModel residuo) {
		return ResponseEntity.ok(categoriaService.cadastrar(residuo));
	}

	@PutMapping("/residuo/atualizar/{id}")
	public ResponseEntity<?> atualizar(@Valid @PathVariable Long id, @RequestBody CategoriaModel residuo) {
		return ResponseEntity.ok(categoriaService.att(id, residuo));
	}

	@DeleteMapping("/residuo/delete/{id}")
	public void delete(@Valid @PathVariable Long id) {
		repository.deleteById(id);
	}
}