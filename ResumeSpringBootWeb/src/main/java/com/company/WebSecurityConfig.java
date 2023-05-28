//package com.company;
//
//
//import com.company.dao.inter.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
////    @Autowired
////    @Qualifier("userDetailsService")
////    private UserDetailsService userDetailsService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        return encoder;
//    }
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails user = User
//                .withUsername("user")
//                .password(passwordEncoder().encode("user"))
//                .roles("USER")
//                .build();
//        UserDetails admin = User
//                .withUsername("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }
//
//
//    //    @Bean
////    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
////        UserDetails user = User
////                .withUsername("user")
////                .password(passwordEncoder().encode("user"))
////                .roles("USER")
////                .build();
////        UserDetails admin = User
////                .withUsername("admin")
////                .password(passwordEncoder().encode("admin"))
////                .roles("ADMIN")
////                .build();
////        return new InMemoryUserDetailsManager(user, admin);
////    }
////    @Bean
////    @Order(1)
////    public SecurityFilterChain apiFilterChain(HttpSecurity http) throws Exception {
////        http
////                .securityMatcher("/api/**")
////                .authorizeHttpRequests(authorize -> authorize
////                        .anyRequest().hasRole("ADMIN")
////                )
////                .httpBasic(withDefaults());
////        return http.build();
////    }
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authz) -> {
//                    authz
//                            .requestMatchers("usersm").hasAuthority("ADMIN")
//                            .anyRequest().authenticated();
//                })
//                .formLogin(withDefaults())
//                .httpBasic(withDefaults())
//                .csrf().disable();
//        return http.build();
//    }
//}
