package com.JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.JUnitTesting.Dto.UserDto;
import com.JUnitTesting.Model.User;
import com.JUnitTesting.Repository.UserRepo;
import com.JUnitTesting.Service.UserService;

@SpringBootTest
class JUnitTestingApplicationTests {
	
	@Autowired
	UserService service;
	
	@MockBean
	UserRepo repo;

	
	@Test
	public void getAllUsersTest() {
		
		when(repo.findAll()).thenReturn(Stream
				.of(new User(1 , "mohan" , "Male" , 23 , "java" ), new User(2 , "Raju" , "Male" , 23 , "python" ))
				.collect(Collectors.toList()));

		assertEquals(2, service.getAll().size());
	}
	
	
	@Test
	public void getUserTest() {
		
		User user =new User(1,"hari","Male",23,"java");
		
		when(repo.findById(1)).thenReturn(user);
		
		assertEquals(user.toString(), service.getUser(1).toString());
	}
	

	@Test
	public void addUserTest() {
		
//		User user = new User(1,"Sanju","Male",20,"Police");
		
		UserDto userDto = new UserDto(0,"Sanju","Male",20,"Police");
		
//		when(repo.save(user)).thenReturn(user);
		
		assertEquals(userDto.toString(), service.addUser(userDto).toString());
	}
		
	
	
	@Test
	public void deleteUserTest() {
		
		User user = new User(1,"Sanju","Male",20,"Police");
		when(repo.findById(1)).thenReturn(user);
		service.deleteUser(1);
		
		verify(repo, times(1)).delete(user);	
		
	}
}
