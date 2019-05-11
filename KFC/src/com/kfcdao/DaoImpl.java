package com.kfcdao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.kfc.Today;

public class DaoImpl implements Dao {

	private SqlSession sqlSession;

	@Override
	public void insert(Today today) {
		try {
			// 加载主配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			// 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			// 相关操作
			sqlSession.insert("insert",today);
			
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}


	
	
}
