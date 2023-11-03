package com.JUnitTesting.Service;

import java.util.List;

import com.JUnitTesting.Dto.UserDto;

public interface UserService {

	public UserDto addUser(UserDto userDto);
	public UserDto getUser(long id);
	public List<UserDto> getAll();
	public String deleteUser(long id);
	
}
