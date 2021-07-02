package org.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.generation.ecommerce.model.Produto;
import org.generation.ecommerce.repository.RepositoryProduto;



@RestController
@RequestMapping("/produto")
public class ControllerProduto {

	@Autowired
	private RepositoryProduto produto;
	
	@GetMapping
	public ResponseEntity<List<Produto>> buscarTodos() {
		return ResponseEntity.ok(produto.findAll());
	}
	
	@GetMapping("/{id_produto}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable long id_produto) {
		return produto.findById(id_produto).map(res -> ResponseEntity.ok(res))
				.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/status/{status}")
	public ResponseEntity<List<Produto>> buscarStatus(@PathVariable String status) {
		return ResponseEntity.ok(produto.findAllByDescricaoContainingIgnoreCase(status));
	}
	@GetMapping("/endereco/{endereco}")
	public ResponseEntity<List<Produto>> buscarEndereco(@PathVariable String endereco) {
		return ResponseEntity.ok(produto.findAllByDescricaoContainingIgnoreCase(endereco));
	}
	@GetMapping("/data_retirada/{data_retirada}")
	public ResponseEntity<List<Produto>> buscarData_retirada(@PathVariable String data_retirada) {
		return ResponseEntity.ok(produto.findAllByDescricaoContainingIgnoreCase(data_retirada));
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Produto>> buscarDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(produto.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	@GetMapping("/quantidade/{quantidade}")
	public ResponseEntity<List<Produto>> buscarQuantidade(@PathVariable String quantidade) {
		return ResponseEntity.ok(produto.findAllByDescricaoContainingIgnoreCase(quantidade));
	}
	
	@PostMapping
	public ResponseEntity<Produto> salvarproduto(@RequestBody Produto produto1) {
		return ResponseEntity.status(HttpStatus.CREATED).body(produto.save(produto1));
	}

	@PutMapping
	public ResponseEntity<Produto> alterar(@RequestBody Produto produto1) {
		return ResponseEntity.ok(produto.save(produto1));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		produto.deleteById(id);
	}
	
}