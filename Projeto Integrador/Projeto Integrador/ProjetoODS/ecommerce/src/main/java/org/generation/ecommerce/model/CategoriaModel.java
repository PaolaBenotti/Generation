package org.generation.ecommerce.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Campo não pode ser nulo")
	private String residuo;

	@NotNull(message = "Campo não pode ser nulo")
	private Float preco;
	
	public Float getPreco() {
		return preco;
	}
	
	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResiduo() {
		return residuo;
	}

	public void setResiduo(String residuo) {
		this.residuo = residuo;
	}

}