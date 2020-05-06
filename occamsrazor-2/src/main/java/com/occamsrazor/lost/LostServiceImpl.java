package com.occamsrazor.lost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LostServiceImpl implements LostService {
	@Autowired LostDao lostDao;

	@Override
	public List<Lost> findAll() {
		System.out.println("2");
		return lostDao.selectAll();
	}
}
