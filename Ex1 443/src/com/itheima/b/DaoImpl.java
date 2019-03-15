package com.itheima.b;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements Dao{
	public void save(){
		System.out.println("保存用户信息到数据库");
	}
}
