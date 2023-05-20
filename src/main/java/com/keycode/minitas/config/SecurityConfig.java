package com.keycode.minitas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public static BCryptPasswordEncoder bCryptPasswordEncoder() {return new BCryptPasswordEncoder();}

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http.csrf().disable();
        http.authorizeHttpRequests(request -> request
                        .requestMatchers("/").permitAll()
                .requestMatchers("/admin").hasRole("ADMIN")
                .requestMatchers("/agent").hasRole("AGENTE")
                .requestMatchers("/analyst").hasRole("ANALISTA")
                .anyRequest()
                .authenticated()
        )
                .userDetailsService(userDetailsService)
                .formLogin();
        return http.build();
    }
}
