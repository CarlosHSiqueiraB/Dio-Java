package com.estudos.springsecuityapirest.config;

import com.estudos.springsecuityapirest.model.User;
import com.estudos.springsecuityapirest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Serviço responsável por buscar usuários no banco de dados
 * para autenticação do Spring Security.
 */
@Service
public class SecurityDatabaseService implements UserDetailsService {

    /**
     * Repositório JPA responsável por acessar a tabela de usuários.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Método chamado automaticamente pelo Spring Security
     * quando alguém tenta realizar login.
     *
     * O Spring recebe o username enviado pelo usuário
     * e busca seus dados no banco.
     */
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // Busca o usuário pelo username
        User userEntity = userRepository.findByUsername(username);

        // Caso não encontre, lança exceção
        if (userEntity == null) {
            throw new UsernameNotFoundException(
                    "Usuário não encontrado: " + username
            );
        }

        /**
         * Conjunto de permissões (roles) do usuário.
         *
         * Exemplo:
         * ROLE_USERS
         * ROLE_MANAGERS
         */
        Set<GrantedAuthority> authorities = new HashSet<>();

        userEntity.getRoles().forEach(role ->
                authorities.add(
                        new SimpleGrantedAuthority("ROLE_" + role)
                )
        );

        /**
         * Retorna um UserDetails que o Spring Security
         * entende e utiliza para autenticação.
         */
        return new org.springframework.security.core.userdetails.User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                authorities
        );
    }
}