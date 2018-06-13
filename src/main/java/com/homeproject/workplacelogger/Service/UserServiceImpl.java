package com.homeproject.workplacelogger.Service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import com.homeproject.workplacelogger.Model.User;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);

	@Override
	public User findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserByUserId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
