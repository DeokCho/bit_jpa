package com.occamsrazor.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.occamsrazor.web.util.Data;
import com.occamsrazor.web.util.Messenger;

@Service
public class AdminServiceImpl implements AdminService{


	@Override
	public void add(Admin admin) {
		try {
			File file = new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV.toString());
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
					String message = admin.toString();
					writer.write(message);
					writer.newLine();
					writer.flush();
		} catch(Exception e) {
			Messenger.FILE_READ_ERROR.toString();
		}
		
	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public Admin login(Admin admin) {
		Admin returnAdmin = null;
		return returnAdmin;
	}

	@Override
	public Admin detail(String adminid) {
		
		return null;
	}

	@Override
	public boolean update(Admin admin) {
		return true;
	}

	@Override
	public boolean remove(String adminid) {
		return true;
	}
	@Override
	public List<Admin> list() {
		List<Admin> adminlist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV.toString());
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine()) != null) {
				list.add(message); 
			}
			reader.close();
		} catch(Exception e) {
			Messenger.FILE_READ_ERROR.toString();
		}
		Admin u = null;
		for(int i =0;i < list.size(); i++) {
			u = new Admin();
			String[] arr = list.get(i).split(",");
			u.setAdminid(arr[0]);
			u.setPasswd(arr[1]);
			u.setName(arr[2]);
			adminlist.add(u);
		}
		return adminlist;
	}
	
	@Override
	public boolean idSearch(String adminid) {
		boolean ok = true;
		List<Admin> list = list();
		for(int i=0; i<list.size(); i++) {
			if(adminid.equals(list.get(i).getAdminid())) {
				ok = false;
				break;
			}
		}
		return ok;
	}

	@Override
	public void saveFile(Admin admin) {
		
	}

	@Override
	public List<Admin> readFile() {
		return null;
	}


}