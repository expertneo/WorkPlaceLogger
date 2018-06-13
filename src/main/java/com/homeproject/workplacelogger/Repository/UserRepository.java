package com.homeproject.workplacelogger.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homeproject.workplacelogger.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserId(Integer userId);

	User findByName(String name);

	User findByEmail(String email);

	List<User> findByAge(int age);

	void createUser(User user);

	void deleteUserByUserId(Integer id);

	void delete(User user);
}
