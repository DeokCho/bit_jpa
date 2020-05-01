package com.occamsrazor.web.user;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.occamsrazor.web.util.Data;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public void insert(User user) {
		try {
			BufferedWriter writer = new BufferedWriter(
									new FileWriter(
									new File(Data.USER_PATH.toString()+Data.LIST+Data.CSV)));
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public List<User> selectAll() {
		return null;
	}

	@Override
	public List<User> selectOne(String userid) {
		return null;
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public void delete(User user) {
		
	}


}
