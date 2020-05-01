package com.occamsrazor.web.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
	private String  name, userid, passwd, ssn, addr, joinDate;
	
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s", 
				name,userid,passwd,ssn,addr,joinDate);
	}
	
}