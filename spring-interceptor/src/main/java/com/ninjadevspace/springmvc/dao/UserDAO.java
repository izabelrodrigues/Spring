package com.ninjadevspace.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.ninjadevspace.springmvc.model.User;

@Repository
public class UserDAO {

	public boolean existUsuario(User usuario) {
		/**
		 * Estamos utilizando um usuario fixo no código para fins didáticos. Na
		 * prática aqui seria seu código de verificar se o usuário existe no
		 * banco de dados.
		 * 
		 */
		if ("teste".equals(usuario.getLogin()) && "123".equals(usuario.getPassword())) {
			return true;
		}
		return false;
	}
}
