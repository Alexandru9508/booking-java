package com.assist.bookingjava.Authentificaton;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import javax.xml.ws.WebServiceException;

/**
 * Created by doroftei on 19.07.2017.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/private","/hello").authenticated()
                .antMatchers(HttpMethod.PUT, "/private").authenticated()
                .antMatchers(HttpMethod.DELETE, "private").authenticated()
                .antMatchers(HttpMethod.GET, "/private").authenticated()
                .anyRequest().permitAll()
                .and().formLogin().loginPage("/login")
                .and()
                .httpBasic().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
