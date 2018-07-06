package com.hy.mvptest.model;

import com.hy.mvptest.bean.UserBean;

public interface IUserModel {
	void setID(int id);

	void setFirstName(String firstName);

	void setLastName(String lastName);

	UserBean load(int id);
}
