package com.message.NotificationServer.Repository;

import java.util.List;

import com.message.NotificationService.Model.UserModel;

public interface UserRepository {
	public String create (UserModel user);
	
	public List<UserModel> getAll();
}
