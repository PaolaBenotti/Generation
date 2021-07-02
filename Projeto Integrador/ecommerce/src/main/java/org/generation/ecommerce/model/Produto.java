package org.generation.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.generation.ecommerce.model.CategoriaModel;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_Produto;
	
	@NotNull
	private String status ;
		
	@NotNull
	private String endereco;
		
	@NotNull
	private String data_retirada;
	
	private String descricao;

	@NotNull
	private long quantidade;
	
	@ManyToOne
	@JsonIgnoreProperties({""})
	private CategoriaModel categoria;

	public long getId_Produto() {
		return id_Produto;
	}

	public void setId_Produto(long id_Produto) {
		this.id_Produto = id_Produto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getData_retirada() {
		return data_retirada;
	}

	public void setData_retirada(String data_retirada) {
		this.data_retirada = data_retirada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	
	
}