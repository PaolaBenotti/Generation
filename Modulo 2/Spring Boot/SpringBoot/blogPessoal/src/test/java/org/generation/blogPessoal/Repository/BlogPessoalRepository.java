package org.generation.blogPessoal.Repository;

import java.util.List;

import org.generation.blogPessoal.Model.BlogPessoalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPessoalRepository extends JpaRepository<BlogPessoalModel, Long> {
public BlogPessoalModel findFirstByNome(String nome);
public List<BlogPessoalModel> findAllByNomeIgnoreCaseContaining(String nome);
}