package com.occamsrazor.lost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.occamsrazor.web.util.Data;

@Repository
public class LostDaoImpl implements LostDao{

	@Override
	public List<Lost> selectAll() {
		System.out.println("3");
		List<Lost> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			File file = new File(Data.ADMIN_PATH.toString()+"lost.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine())!=null) {
				temp.add(message);
			}
			reader.close();
		} catch(Exception e) {
			System.out.println("에러");
		}
		Lost searchlost = null;
		for(int i=0; i<temp.size(); i++) {
			searchlost = new Lost();
			String[] arr = temp.get(i).split(",");
			
			searchlost.setNo1(arr[0]);
			searchlost.setNo2(arr[1]);
			searchlost.setNo3(arr[2]);
			searchlost.setNo4(arr[3]);
			searchlost.setNo5(arr[4]);
			list.add(searchlost);
		}
		return list;
	}

}
