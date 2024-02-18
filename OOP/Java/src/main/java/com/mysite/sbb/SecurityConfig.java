package com.mysite.sbb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration//스프링환경설정파일임을 의미
@EnableWebSecurity// 모든 요청url이 스프링시큐리티의 제어를 받도록 만드는 어노테이션
public class SecurityConfig {

    /**
     * http
     *                 .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
     *                         .requestMatchers(new AntPathRequestMatcher("/**")).permitAll());
     *         return http.build();
     *
     *         이 설정으로 인증되지않은 모든 페이지의 요청을 허락한다는 의미 로그인안해도 접근가능.
     *
     *
     *
     */
    @Bean //빈 수동등록한거고 필터를 생성해서 url별로 설정이 가능해졌다.
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
                        .requestMatchers(new AntPathRequestMatcher("/**")).permitAll())
                .csrf((csrf) -> csrf
                        .ignoringRequestMatchers(new AntPathRequestMatcher
                                ("/h2-console/**")))
                .headers((headers) -> headers
                        .addHeaderWriter(new XFrameOptionsHeaderWriter(
                                XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN
                        )));
        return http.build();
    }


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
