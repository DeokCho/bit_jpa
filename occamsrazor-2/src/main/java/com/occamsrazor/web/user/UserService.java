package com.occamsrazor.web.user;

import java.util.List;

public interface UserService {

	void register(User user);

	List<User> findAll();

	User findOne(String userid);

	void modify(User user);

	void remove(User user);

}