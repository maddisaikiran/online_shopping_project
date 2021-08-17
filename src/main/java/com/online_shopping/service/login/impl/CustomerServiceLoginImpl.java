package com.online_shopping.service.login.impl;

import com.online_shopping.dao.login.CustomerLoginDAO;
import com.online_shopping.dao.login.impl.CustomerLoginDAOImpl;
import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;
import com.online_shopping.service.login.CustomerServiceLogin;

public class CustomerServiceLoginImpl implements CustomerServiceLogin{

	@Override
	public Register customerLogin(String register_email, String register_password) throws BusinessException {
		Register register = null;
		if(register_email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$")) {
			CustomerLoginDAO customerLoginDAO = new CustomerLoginDAOImpl();
			register = customerLoginDAO.customerLogin(register_email, register_password);
		}else {
			throw new BusinessException("Invalid email id");
		}
		return register;
	}

}
