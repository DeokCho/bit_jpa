package com.occamsrazor.web.user;

import java.util.List;

public interface UserService {

	List<User> list(User user);

	List<User> detail(String userid);

	void register(User user);

	void modify(User user);

	void remove(User user);

}