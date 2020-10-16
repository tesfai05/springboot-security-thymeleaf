package com.tesfai.springboot.springsecurity;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tesfai.springboot.springsecurity.model.Role;
import com.tesfai.springboot.springsecurity.repository.RoleRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Role> roles =roleRepository.findAll();
		if(roles==null||roles.size()<1) {
			Role r1 = new Role();
			r1.setName("ROLL_USER");
			Role r2 = new Role();
			r2.setName("ROLL_ADMIN");
			List<Role> savedRoles = Arrays.asList(r1,r2);
			roleRepository.saveAll(savedRoles);
		}
		
		
	}
}
