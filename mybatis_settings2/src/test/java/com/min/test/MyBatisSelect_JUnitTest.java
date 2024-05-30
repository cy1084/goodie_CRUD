package com.min.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.min.edu.model.IStadiumSelectDao;
import com.min.edu.model.StadiumSelectDaoImpl;

public class MyBatisSelect_JUnitTest {
	private IStadiumSelectDao dao;

	@Before
	public void init() {
		dao=new StadiumSelectDaoImpl();
	}
	@Test
	public void test() {
		Integer seat_count=dao.select01("안양경기장");
		assertNotNull(seat_count);
	}

}
