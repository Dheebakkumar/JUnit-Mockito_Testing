package com.JUnitTesting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JUnitTesting.Dto.UserDto;
import com.JUnitTesting.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public UserDto addUser(@RequestBody UserDto userDto) {
		
		return service.addUser(userDto);
	}
	
	@GetMapping("/get/{id}")
	public UserDto getUser(@PathVariable long id) {
		
		return service.getUser(id);
	}

	@GetMapping("/getAll")
	public List<UserDto> getAll(){
		
		return service.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		
		return service.deleteUser(id);
	}
}
