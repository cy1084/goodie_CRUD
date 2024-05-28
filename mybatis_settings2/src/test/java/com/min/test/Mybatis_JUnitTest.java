package com.min.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.min.edu.mybatis.SqlSessionFactoryManager;
import com.min.edu.vo.StadiumVo;

public class Mybatis_JUnitTest {

	private SqlSession session;
	@Before
	public void test() {
		SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
		session= manager.openSession();
		assertNotNull(session);
		
	}
	
	@Test
	public void mapper_A_Test() {
		List<StadiumVo> lists= session.selectList("com.min.edu.stadium.selectStadiumAll");
		assertNotEquals(0,lists.size());
	}
	

}
