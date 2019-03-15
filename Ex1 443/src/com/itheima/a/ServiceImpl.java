package com.itheima.a;

public class ServiceImpl  implements Service{
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
