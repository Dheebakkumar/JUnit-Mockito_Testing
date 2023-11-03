package com.JUnitTesting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JUnitTesting.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	public User findById(long id);
}
