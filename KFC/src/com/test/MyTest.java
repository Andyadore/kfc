package com.test;

import org.junit.Test;

import com.kfc.Main;
import com.kfc.Today;
import com.kfcdao.Dao;
import com.kfcdao.DaoImpl;

public class MyTest {

	@Test
	public void insert(){	
		Dao dao=new DaoImpl();
		Today today=new Today(4,4,5.7);
		dao.insert(today);
	}
		
}
