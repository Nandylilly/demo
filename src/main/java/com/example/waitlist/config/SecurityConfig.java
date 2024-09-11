package com.example.waitlist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Disable CSRF (enable it as needed)
                .authorizeRequests()
                .antMatchers("/api/**").authenticated() // Protect all /api/* endpoints
                .anyRequest().permitAll() // Allow all other requests
                .and()
                .oauth2ResourceServer().jwt() // Enable OAuth2 Resource Server with JWT validation
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS); // Stateless session management

        return http.build();
    }
}
