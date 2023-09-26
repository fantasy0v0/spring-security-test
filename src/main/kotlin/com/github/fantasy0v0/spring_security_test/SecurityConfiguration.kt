package com.github.fantasy0v0.spring_security_test

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

class SecurityConfiguration {

  @Bean
  fun filterChain(http: HttpSecurity): SecurityFilterChain {
    http.csrf { it.disable() }

    return http.build()
  }

}
