package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.services.UserService;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running the project");
		
//		User user = new User();
//		user.setFirstName("Durgesh");
//		user.setLastName("Tiwari");
//		user.setUsername("durgesh123");
//		user.setPassword("durgesh123");
//		
//		Role role1 = new Role();
//		role1.setRoleId(1L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		
//		System.out.println(user1.getUsername());
		
	}

}
