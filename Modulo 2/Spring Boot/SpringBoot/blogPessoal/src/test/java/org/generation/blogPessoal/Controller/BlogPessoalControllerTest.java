package org.generation.blogPessoal.Controller;

import org.generation.blogPessoal.Model.BlogPessoalModel;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

    @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class BlogPessoalControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	private BlogPessoalModel contato;
	private BlogPessoalModel contatoupd;
	

	@BeforeAll
	public void start() {
		contato = new BlogPessoalModel(null, "Maria", "21", "44451198");
		contatoupd = new BlogPessoalModel(2L,"Maria da Silva", "23", "995467892");
	}

	@Test
	public void deveRealizarPostContatos() {
		HttpEntity<BlogPessoalModel> request = new HttpEntity<BlogPessoalModel>(contato);
		ResponseEntity<BlogPessoalModel> resposta = testRestTemplate
				.exchange("/contatos/inserir", HttpMethod.POST, request, BlogPessoalModel.class);
		Assert.assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}

	@Disabled
	@Test
	public void deveMostrarTodosContatos() {
		ResponseEntity<String> resposta = testRestTemplate
				.exchange("/contatos/", HttpMethod.GET, null, String.class);
		Assert.assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}

	@Disabled
	@Test
	public void deveRealizarPutContatos() {
		HttpEntity<BlogPessoalModel> request = new HttpEntity<BlogPessoalModel>(contatoupd);
		ResponseEntity<BlogPessoalModel> resposta = testRestTemplate
				.exchange("/contatos/alterar", HttpMethod.PUT, request, BlogPessoalModel.class);
						Assert.assertEquals(HttpStatus.OK, resposta.getStatusCode());
				}
}
