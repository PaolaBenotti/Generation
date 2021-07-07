package org.generation.MinhaLojaDeGames.Repository;

import java.util.Optional;

import org.generation.MinhaLojaDeGames.Categoria.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);

}
