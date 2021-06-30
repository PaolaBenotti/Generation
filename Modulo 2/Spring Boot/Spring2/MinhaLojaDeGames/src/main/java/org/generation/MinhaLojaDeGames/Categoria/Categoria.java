package org.generation.MinhaLojaDeGames.Categoria;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_categoria;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "adicionar")
	private List<Produto> adicionarProduto = new ArrayList<>();
	
	
	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public List<Produto> getAdicionarProduto() {
		return adicionarProduto;
	}

	public void setAdicionarProduto(List<Produto> adicionarProduto) {
		this.adicionarProduto = adicionarProduto;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}