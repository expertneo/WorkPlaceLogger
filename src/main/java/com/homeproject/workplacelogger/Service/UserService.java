package com.homeproject.workplacelogger.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.homeproject.workplacelogger.Model.User;

@Service
public interface UserService {

	/**
	 * Finds user by Id.
	 * 
	 * @param userId
	 * @return
	 */
	User findByUserId(Integer userId);

	/**
	 * Finds user by name.
	 * 
	 * @param name
	 * @return
	 */
	User findByName(String name);

	/**
	 * Finds user by email.
	 * 
	 * @param email
	 * @return
	 */
	User findByEmail(String email);

	/**
	 * Finds the list of users by age.
	 * 
	 * @param age
	 * @return
	 */
	List<User> findByAge(int age);

	/**
	 * Creates a user in the database.
	 * 
	 * @param user
	 */
	void createUser(User user);

	/**
	 * Deletes user by userId.
	 * 
	 * @param id
	 */
	void deleteUserByUserId(Integer id);

	/**
	 * Deletes user.
	 * 
	 * @param user
	 */
	void deleteUser(User user);
}
