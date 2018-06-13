package com.homeproject.workplacelogger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homeproject.workplacelogger.Model.User;
import com.homeproject.workplacelogger.Service.ActivityServiceImpl;
import com.homeproject.workplacelogger.Service.UserServiceImpl;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private ActivityServiceImpl activityServiceImpl;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(method = RequestMethod.POST, value = "/createUser")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		if (user == null) {
			return new ResponseEntity<String>("Error", HttpStatus.OK);
		}
		userServiceImpl.createUser(user);
		return new ResponseEntity<String>(user.toString(), HttpStatus.OK);
	} 
}
