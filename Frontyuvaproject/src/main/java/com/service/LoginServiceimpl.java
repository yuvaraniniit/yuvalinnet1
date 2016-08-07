package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LoginDAO;
import com.model.Login;

@Service
@Transactional
public class LoginServiceimpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;

	public boolean check(Login lo) {
		boolean b=false;
		b=loginDAO.check(lo);
		if(b==true){
			b=true;
		}
		return b;
	
	}

	public void disc(Login lo) {
		// TODO Auto-generated method stub
		loginDAO.check(lo);
	}

	@Override
	public void ind(Login l0) {
		// TODO Auto-generated method stub
		
	}
	


}




