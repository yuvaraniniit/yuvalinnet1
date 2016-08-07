package com.dao;

import com.model.Login;

public interface LoginDAO {
	public boolean check(Login lo);
	public void disc(Login lo);

}
