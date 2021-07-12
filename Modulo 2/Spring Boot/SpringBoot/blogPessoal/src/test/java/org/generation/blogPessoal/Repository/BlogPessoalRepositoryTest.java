package org.generation.blogPessoal.Repository;

import java.util.List;

import org.generation.blogPessoal.Model.BlogPessoalModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.util.Assert;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BlogPessoalRepositoryTest {

	@Autowired
	private BlogPessoalRepository blogPessoalRepository;
	
	@BeforeAll
	public void start() {
		BlogPessoalModel contato = new BlogPessoalModel(null, "Chefe", "0y", "9xxxxxxx9");
		if (blogPessoalRepository.findFirstByNome(contato.getNome()) == null)
			blogPessoalRepository.save(contato);
		contato = new BlogPessoalModel(null, "Novo Chefe", "0y", "8xxxxxxx8");

		if (blogPessoalRepository.findFirstByNome(contato.getNome()) == null)
			blogPessoalRepository.save(contato);
		contato = new BlogPessoalModel(null, "chefe Mais Antigo", "0y", "7xxxxxxx7");
    	
		if (blogPessoalRepository.findFirstByNome(contato.getNome()) == null)
			blogPessoalRepository.save(contato);
		contato = new BlogPessoalModel(null, "Amigo", "0z", "5xxxxxxx5");
    	
		if (blogPessoalRepository.findFirstByNome(contato.getNome()) == null)
			blogPessoalRepository.save(contato);
		}
    	
	@Test
	public void findByNomeRetornaContato() throws Exception {
		BlogPessoalModel contato = blogPessoalRepository.findFirstByNome("Chefe");
		Assert.assertTrue(contato.getNome().equals("Chefe"));
		}
    	
	@Test
	public void findAllByNomeIgnoreCaseRetornaTresContato() {
		List<BlogPessoalModel> contatos = blogPessoalRepository
				.findAllByNomeIgnoreCaseContaining("chefe");
		Assert.assertEquals(3, contatos.size());
    	}
	
	@AfterAll
	public void end() {
		blogPessoalRepository.deleteAll();
	}

}
