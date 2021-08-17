package com.online_shopping.dao.login;

import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;

public interface CustomerLoginDAO {
	public Register customerLogin(String register_email, String register_password) throws BusinessException;

}
