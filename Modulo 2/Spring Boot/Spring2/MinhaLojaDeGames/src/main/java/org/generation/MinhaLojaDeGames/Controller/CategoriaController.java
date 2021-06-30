package org.generation.MinhaLojaDeGames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.generation.MinhaLojaDeGames.Categoria.Categoria;
import org.generation.MinhaLojaDeGames.Repository.CategoriaRepository;

@Controller
@RequestMapping("/home")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoria;

	@GetMapping
	public ResponseEntity<List<Categoria>> buscarTodos() {
		return ResponseEntity.ok(categoria.findAll());
	}

	@GetMapping("/categoria/{id_categoria}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable long id_categoria) {
		return categoria.findById(id_categoria).map(res -> ResponseEntity.ok(res))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> buscarDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(categoria.findAllByNomeContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<Categoria> salvarCategoria(@RequestBody Categoria categ) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoria.save(categ));
	}

	@PutMapping
	public ResponseEntity<Categoria> alterar(@RequestBody Categoria categ) {
		return ResponseEntity.ok(categoria.save(categ));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categoria.deleteById(id);
	}

}