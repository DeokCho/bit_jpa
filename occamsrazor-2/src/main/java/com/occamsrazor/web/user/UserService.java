package com.occamsrazor.web.user;

import java.util.List;

public interface UserService {
	public List<User> findAll();

	public User findOne(String userid);

	void register(User user);

	void modify(User user);

	void remove(User user);


}