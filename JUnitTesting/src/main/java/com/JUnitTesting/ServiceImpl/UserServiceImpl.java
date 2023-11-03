package com.JUnitTesting.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JUnitTesting.Dto.UserDto;
import com.JUnitTesting.Model.User;
import com.JUnitTesting.Repository.UserRepo;
import com.JUnitTesting.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo repo;

	@Override
	public UserDto addUser(UserDto userDto) {

		User user = new User();
		
		user.setName(userDto.getName());
		user.setAge(userDto.getAge());
		user.setGender(userDto.getGender());
		user.setRole(userDto.getRole());
		
		repo.save(user);
		

		return dto(user);
	}

	
	public UserDto dto(User details) {
		
		UserDto dto = new UserDto();
		
		dto.setId(details.getId());
		dto.setName(details.getName());
		dto.setAge(details.getAge());
		dto.setGender(details.getGender());
		dto.setRole(details.getRole());
		
		return dto;
	}
	
	
	@Override
	public UserDto getUser(long id) {

		User checkId = repo.findById(id);
		if(checkId !=null) {
			
			return dto(checkId);
		}
		
		else throw new RuntimeException("User id is Not Present");
		
	}

	@Override
	public List<UserDto> getAll() {

		List<User> list = repo.findAll();
		
		List<UserDto> newList = new ArrayList<UserDto>();
		
		list.forEach(each ->{
			
			newList.add(dto(each));
		});
		
		return newList;
	}

	@Override
	public String deleteUser(long id) {

		User checkId = repo.findById(id);
		if(checkId !=null) {
			
			repo.delete(checkId);
			
			return "Deleted Successfully";
		}
		
		else throw new RuntimeException("User id is Not Present");
	}

}
