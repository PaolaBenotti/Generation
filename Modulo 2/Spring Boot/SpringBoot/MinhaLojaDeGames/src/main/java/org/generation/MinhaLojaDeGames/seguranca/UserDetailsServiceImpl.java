package org.generation.MinhaLojaDeGames.seguranca;

import java.util.Optional;

import org.generation.MinhaLojaDeGames.Categoria.Usuario;
import org.generation.MinhaLojaDeGames.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override 
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional <Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(()-> new UsernameNotFoundException(userName + "not found."));
		
		return user.map(UserDetailsImpl::new).get();
		}
}
