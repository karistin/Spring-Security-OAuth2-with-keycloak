package com.programming.techie.pkce.config;

import java.util.List;
import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig implements SecurityFilterChain {

    @Override
    public boolean matches(HttpServletRequest httpServletRequest) {
        return false;
    }

    @Override
    public List<Filter> getFilters() {
        return null;
    }
}
