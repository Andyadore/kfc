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
			// �����������ļ�
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			// ����SqlSessionFactory����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			// ��ز���
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
