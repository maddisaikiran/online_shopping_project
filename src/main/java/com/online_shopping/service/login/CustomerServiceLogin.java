package com.online_shopping.service.login;

import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;

public interface CustomerServiceLogin {
	public Register customerLogin(String register_email, String register_password) throws BusinessException;
}
