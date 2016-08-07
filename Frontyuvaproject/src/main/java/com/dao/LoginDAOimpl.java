  package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Login;

@Repository
@Transactional
public class LoginDAOimpl implements LoginDAO{
	
@Autowired
private SessionFactory sf;

public boolean check(Login lo) {
		boolean isvalidLogin=false;
		Query q=(Query) sf.openSession().createQuery("from Backend_User where name='"+lo.getName()+"'").list();	
		@SuppressWarnings("unchecked")
			List<Login> l= q.list();
		int s=l.size();
		if(s==1)
		{
			isvalidLogin=true;
		}
		return isvalidLogin;
	}
public void ind(Login lo) {
	
			sf.getCurrentSession().saveOrUpdate(lo);

		}

@Override
public void disc(Login lo) {
	// TODO Auto-generated method stub
	
}  
		// TODO Auto-generated method stub
		
	}
	

