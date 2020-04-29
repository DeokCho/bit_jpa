package com.occamsrazor.web.admin;

import java.util.List;

import com.occamsrazor.web.user.User;

public interface AdminService {

	public void add(Admin admin);
	public int count();
	public Admin login(Admin admin);
	public Admin detail(String adminid);
	public boolean update(Admin admin);
	public boolean remove(String adminid);
	public List<Admin> list();
	public boolean idSearch(String admin);
	public void saveFile(Admin admin);
	public List<Admin> readFile();

}