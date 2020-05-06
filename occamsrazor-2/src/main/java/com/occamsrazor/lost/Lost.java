package com.occamsrazor.lost;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter @Getter
public class Lost {
private String no1, no2, no3, no4, no5;

@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", no1,no2,no3,no4,no5);
	}
}
