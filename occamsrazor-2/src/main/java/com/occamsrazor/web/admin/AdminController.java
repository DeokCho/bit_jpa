package com.occamsrazor.web.admin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Messenger;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired AdminService adminService;
	@PostMapping("/join")
	public Messenger join(@RequestBody Admin admin) {
		int count = adminService.count();
		adminService.saveFile(admin);
		// return (adminService.count() == count + 1) ? Messenger.SUCCESS : Messenger.FAIL;
		return Messenger.SUCCESS;
	}
	@GetMapping("/list")
	public List<Admin> list(){
		// return adminService.list();
		return adminService.readFile();
	}
	
	@PostMapping("/login")
	public Map<String,Object> login(@RequestBody Admin admin) {
		Map<String,Object> returnMap = new HashMap<>();
		Admin loginedAdmin = adminService.login(admin);
		if(loginedAdmin != null) {
			returnMap.put("admin", loginedAdmin);
			returnMap.put("messenger", Messenger.SUCCESS);
		}else {
			returnMap.put("messenger", Messenger.FAIL);
		}
		return returnMap;
	}
	@GetMapping("/detail/{adminid}")
	public Admin detail(@PathVariable String adminid) {
		return adminService.detail(adminid);
	}
	@PutMapping("/update")
	public Messenger update(@RequestBody Admin admin) {
		System.out.println("update 정보 ::: "+admin);
		return (adminService.update(admin)) ? Messenger.SUCCESS: Messenger.FAIL;
	}
	@DeleteMapping("/remove/{adminid}")
	public Messenger remove(@PathVariable String adminid) {
		System.out.println("delete 정보 ::: "+adminid);
		return (adminService.remove(adminid)) ? Messenger.SUCCESS: Messenger.FAIL;
	}
	
	@GetMapping("/idsearch/{adminid}")
	public Messenger idSearch(@PathVariable String adminid) {
		return (adminService.idSearch(adminid))? Messenger.SUCCESS: Messenger.FAIL;
	}

}
