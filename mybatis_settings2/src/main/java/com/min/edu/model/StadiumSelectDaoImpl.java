package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlSessionFactoryManager;

public class StadiumSelectDaoImpl implements IStadiumSelectDao {
	private Logger log=Logger.getLogger(this.getClass());
	
	private final String NS="com.min.edu.model.StadiumSelectDaoImpl.";
	
	private SqlSessionFactory manager;

	public StadiumSelectDaoImpl() {
		manager=SqlSessionFactoryManager.getFactory();
	}
	
	public Integer select01(String stadium_name) {
		log.trace("select01 TRACE 로그");
		SqlSession session = manager.openSession();
		return session.selectOne(NS + "select01", stadium_name);
	}

}
