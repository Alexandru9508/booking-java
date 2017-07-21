package com.assist.bookingjava;

import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
}

@Configuration
class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Autowired
    CompanyService companyService;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }

    @Bean
    UserDetailsService userDetailsService() {
        return email -> {
            Company company = companyService.findByEmail(email);
            if (company != null) {
                return new User(company.getUsername(), company.getPassword(), true, true, true, true,
                        AuthorityUtils.createAuthorityList("USER"));
            } else {
                throw new UsernameNotFoundException("could not find the user '"
                        + email + "'");
            }
        };
    }
}

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login","/allCompanys", "/hello","/register","/addCompanyInfo","/updateCompany/{id}",
                        "/deleteCompany/{id}","/recover","/info/{name}","/allCompanys","/services/bookings",
                        "/service/{name}/bookings","/service/{id}/addbooking","/company/{idcompnay}/services", "/Delete/Service/{id}",
                        "/company/{id}/service","/company/service/{id}","/company/services","/serviceCompany/{id}/addServiceInfo",
                        "/serviceCompany/time","/uploads","/company/{id}").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
    }
}