package com.homeproject.workplacelogger.Service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeproject.workplacelogger.Model.User;
import com.homeproject.workplacelogger.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.UserService#findByUserId(java.lang.
	 * Integer)
	 */
	@Override
	public User findByUserId(Integer userId) {
		return userRepository.findByUserId(userId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.UserService#findByName(java.lang.
	 * String)
	 */
	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.UserService#findByEmail(java.lang.
	 * String)
	 */
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.homeproject.workplacelogger.Service.UserService#findByAge(int)
	 */
	@Override
	public List<User> findByAge(int age) {
		return userRepository.findByAge(age);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.homeproject.workplacelogger.Service.UserService#createUser(com.
	 * homeproject.workplacelogger.Model.User)
	 */
	@Override
	public void createUser(User user) {
		userRepository.createUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.UserService#deleteUserByUserId(java.
	 * lang.Integer)
	 */
	@Override
	public void deleteUserByUserId(Integer id) {
		userRepository.deleteById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.homeproject.workplacelogger.Service.UserService#deleteUser(com.
	 * homeproject.workplacelogger.Model.User)
	 */
	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}
