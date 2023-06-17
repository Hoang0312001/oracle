package com.message.NotificationServer.Repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.message.NotificationServer.Repository.UserRepository;
import com.message.NotificationService.Model.UserModel;

@Repository
public class UserJdbcRepository implements UserRepository {
	
    private final JdbcTemplate jdbcTemplatea;
    
    @Autowired
    private UserJdbcRepository(JdbcTemplate jdbcTemplate) {
    	this.jdbcTemplatea = jdbcTemplate;
    }
    
    
	@Override
	public String create(UserModel user) {
		// TODO Auto-generated method stub	
		StringBuilder query = new StringBuilder("Insert into com_User ");
		query.append(" (user_id,password,role,status) values (?,?,?,?) ");
		try {
		jdbcTemplatea.update(query.toString(), new Object [] {user.getUserName() , user.getPassWord(),user.getRole(),user.getStatus()});
		}catch (Exception e) {
			return "thêm thất bại" + e.getMessage();
		}
		return "thêm thành công";
		
	}

	@Override
	public List<UserModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
