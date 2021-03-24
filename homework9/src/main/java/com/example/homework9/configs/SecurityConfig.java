package com.example.homework9.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("vasya").password("{noop}1111").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("olia").password("{noop}1111").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.csrf().disable()
               .authorizeRequests()
               .antMatchers("/").hasAnyRole("USER", "ADMIN")
               .antMatchers("/admin/**").hasRole("ADMIN")
               .antMatchers("/user/**").hasRole("USER")
               .antMatchers("/wide").permitAll()
               .and()
               .httpBasic()
               .and()
               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }
}
