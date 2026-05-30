package com.estudos.springsecuityapirest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@EnableMethodSecurity // Aqui habilito a segurança baseado em anotações (Equivalente ao EnableGlobal)
@Configuration
public class WebSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails user = User.builder() // Criando um user
                .username("user")
                .password("{noop}user123") // NOOP significa que pedimos para a senha não ser criptografada
                .roles("USERS")
                .build();

        UserDetails manager = User.builder()
                .username("admin")
                .password("{noop}admin123")
                .roles("MANAGERS")
                .build();

        return new InMemoryUserDetailsManager(user, manager);

    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { // Aqui é tipo meu constructor, so que da segurança, ela funciona tipo uma corrente de filtros, que são esses abaixo

        http
                .csrf(csrf -> csrf.disable()) // Desabilitando proteção contra falsificação de requisições(para poder testar elas depois com postman e swagger) mas o padrão e ficar ativada
                .authorizeHttpRequests(auth -> auth // Qualquer endpoint vai precisar de login

                        .requestMatchers("/")
                        .permitAll()

                        // Aqui é praticamente o @PreAutorizer, so que nas configurações do webSecurity
                        .requestMatchers("/managers/**")
                        .hasRole("MANAGERS")


                        .requestMatchers("/users")
                        .hasAnyRole("USERS", "MANAGERS")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}