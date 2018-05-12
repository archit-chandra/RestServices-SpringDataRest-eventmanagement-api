package com.archit.eventmanagement;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // defines the users and roles => authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // has many other authentication types
        auth.inMemoryAuthentication()
                .withUser("bharath").password("bharath").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("ADMIN");
    }

    // configures authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                // 3 types of antMatchers methods
                .antMatchers(HttpMethod.POST, "/events").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/events/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/events/**").hasRole("ADMIN");
    }
}
