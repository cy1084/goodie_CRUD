package com.min.edu.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryManager {
	private static SqlSessionFactory factory; //싱글톤
	
	static { //클래스가 처음 로딩될 때 실행, 객체 초기화
		String path="mybatis/Configuration.xml";
		try {
			//SqlSessionFactoryBuilder를 사용하여 SqlSessionFactory 객체를 생성
			Reader reader= Resources.getResourceAsReader(path);
			factory=new SqlSessionFactoryBuilder().build(reader);
			reader.close();
			System.out.println("SqlSessionFactory 객체 생성 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static SqlSessionFactory getFactory() {
		return factory;
	}

}
