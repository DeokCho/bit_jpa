package com.occamsrazor.web.util;

public enum Messenger {
	SUCCESS, FAIL, FILE_READ_ERROR;
	
	@Override
	public String toString() {
		String returnMessenger = "";
		switch(this) {
		case FILE_READ_ERROR: returnMessenger = "파일 읽기에서 에러발생"; break;
		default:
			break;
		}
		return returnMessenger;
	}
}