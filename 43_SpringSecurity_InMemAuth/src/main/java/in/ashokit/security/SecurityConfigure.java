package in.ashokit.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import in.ashokit.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigure {
	
	
	
	
	
//	@Bean
//	public InMemoryUserDetailsManager configureUsers() {
//		
//		UserDetails adminUser = User.withDefaultPasswordEncoder()
//									.username("ashok")
//									.password("ashok@123")
//									.authorities("ADMIN")
//									.build();
//		
//		UserDetails normalUser = User.withDefaultPasswordEncoder()
//									.username("raja")
//									.password("raja@123")
//									.authorities("USER")
//									.build();
//		
//		return new  InMemoryUserDetailsManager(adminUser, normalUser);
//		
//		
//		
//	}
//	
	
	@Autowired
	private MyUserDetailsService userDtlsService;
	
	@Autowired
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.userDetailsService(userDtlsService) 
			   .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	
	
	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests((req)->
			req.antMatchers("/contact").permitAll()
			   .anyRequest().authenticated()
		 ).formLogin();
		return http.build();
	}
}	
				
				
				  
				
				
				
				
