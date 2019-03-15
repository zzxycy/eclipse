package com.itheima.b;

import javax.annotation.Resource;



@org.springframework.stereotype.Service("service")
public class ServiceImpl implements Service {
	@Resource(name="dao")
	private Dao dao;	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		this.dao.save();
	}
}
