/*
 * package com.VegetablesSell.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import org.springframework.security.core.userdetails.User;
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * import org.springframework.security.web.SecurityFilterChain;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig {
 * 
 * @Bean public UserDetailsService userDetailsService() {
 * InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
 * manager.createUser(User.withUsername("seller") .password("{noop}password") //
 * {noop} indicates no password encoder .roles("SELLER") .build());
 * manager.createUser(User.withUsername("buyer") .password("{noop}password")
 * .roles("BUYER") .build()); return manager; }
 * 
 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
 * throws Exception { http .authorizeHttpRequests(authorize -> authorize
 * .requestMatchers("/products/**").hasRole("SELLER")
 * .anyRequest().authenticated() ) .formLogin() .and() .httpBasic(); return
 * http.build(); } }
 */