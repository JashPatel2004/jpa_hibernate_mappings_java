package com.jash.jpaCrudDemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class AppConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        return http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        auth -> auth.requestMatchers("/api/**").authenticated().anyRequest().permitAll())
                .addFilterBefore(new com.jash.jpaCrudDemo.security.JwtValidator(), BasicAuthenticationFilter.class)
//                .cors(
//                        config -> config.configurationSource(request -> {
//
//                            CorsConfiguration cfg = new CorsConfiguration();
//
//                            cfg.setAllowedOrigins(List.of("http://localhost:4200"));
//                            cfg.setAllowedMethods(Collections.singletonList("*"));
//                            cfg.setAllowCredentials(true);
//                            cfg.setAllowedHeaders(Collections.singletonList("*"));
//                            cfg.setExposedHeaders(List.of("Authorization"));
//                            cfg.setMaxAge(3600L);
//                            return cfg;
//                        }))
                .build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
