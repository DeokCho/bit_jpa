package com.occamsrazor.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	public Messenger add(@RequestBody Admin admin) {
		int current = adminService.count();
		String s = "";
		adminService.add(admin);
		return (adminService.count() == (current+1))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@PostMapping("/login")
	public Messenger login(@RequestBody Admin admin) {
		return (adminService.login(admin))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/list")
	public Admin[] list() {
		Admin[] admins = new Admin[5];
		return admins;
	}
	
	@GetMapping("/detail")
	public Admin detail(@RequestBody Admin admin) {
		Admin returnAdmin = new Admin();
		return returnAdmin;
	}
	@GetMapping("/count")
	public int count() {
		int count = 0;
		return count;
	}
	@PutMapping("/update")
	public Admin update(@RequestBody Admin admin) {
		Admin returnAdmin = new Admin();
		return returnAdmin;
	}
	@DeleteMapping("/delete")
	public Admin delete(@RequestBody Admin admin) {
		Admin returnAdmin = new Admin();
		return returnAdmin;
	}
}
