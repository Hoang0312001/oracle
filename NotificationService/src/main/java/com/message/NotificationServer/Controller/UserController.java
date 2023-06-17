package com.message.NotificationServer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.message.NotificationServer.Repository.UserRepository;
import com.message.NotificationService.Model.UserModel;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserRepository repository;
	
	@Autowired
	public UserController(UserRepository userRepository) {
		this.repository = userRepository;
	}
	@PostMapping("/add")
	public String addUser(@RequestBody UserModel model) {
		System.out.println(model);
		return "thêm thành công";
	}
	 @RequestMapping(value="", method=RequestMethod.GET)
	    public void getAllUsers() {
	        System.out.println("xin chào");
	    }
}
