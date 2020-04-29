package com.occamsrazor.web.util;

import java.io.File;

public enum Data {
	USER_PATH, ADMIN_PATH, CSV, LIST;
	
	@Override
	public String toString() {
		String returnValue = "";
		switch(this) {
		case USER_PATH: returnValue = "C:"+File.separator+"Users"+File.separator
				+"user"+File.separator+"git"+File.separator+"repository4"+File.separator
				+"occamsrazor-2"+File.separator+"src"+File.separator+"main"+File.separator
				+"java"+File.separator+"com"+File.separator+"occamsrazor"+File.separator
				+"web"+File.separator+"user"+File.separator; break;
		case ADMIN_PATH: returnValue = "C:"+File.separator+"Users"+File.separator
				+"user"+File.separator+"git"+File.separator+"repository4"+File.separator
				+"occamsrazor-2"+File.separator+"src"+File.separator+"main"+File.separator
				+"java"+File.separator+"com"+File.separator+"occamsrazor"+File.separator
				+"web"+File.separator+"admin"+File.separator; break;
		default:
			break;
		}
		return returnValue;
	}
}
