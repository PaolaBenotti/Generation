package org.generation.MinhaLojaDeGames.Categoria;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Produto;
	
	@NotNull
	private String nome;
	
	@NotNull
	private float preco;
	
	private String descricao;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	private Categoria adicionar;


	public Categoria getAdicionar() {
		return adicionar;
	}

	public void setAdicionar(Categoria adicionar) {
		this.adicionar = adicionar;
	}

	public Long getId_Produto() {
		return id_Produto;
	}

	public void setId_Produto(Long id_Produto) {
		this.id_Produto = id_Produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}