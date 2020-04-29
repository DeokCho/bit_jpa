package com.occamsrazor.web.admin;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Admin {
	private String adminid,passwd, name, 
				position, profile, email, phoneNumber, registerDate;
}