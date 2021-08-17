package com.online_shopping.service.create.impl;

import com.online_shopping.dao.create.CustomerDAOCreate;
import com.online_shopping.dao.create.impl.CustomerDAOCreateImpl;
import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;
import com.online_shopping.service.create.CreateFunctionality;

public class CreateFunctionalityImpl implements CreateFunctionality{
	

	@Override
	public int createCustomer(Register register) throws BusinessException {
		int c = 0;
		
		if(register.getRegister_first_name().matches("[a-zA-Z]{3,20}") && register.getRegister_last_name().matches("[a-zA-Z]{3,20}") && 
				register.getRegister_email().matches("[a-z]{5,20}[@gmail.com]{10}") 
				&& register.getRegister_password().matches("[A-Z]{1}[a-zA-Z0-9]{7,30}")) {
			CustomerDAOCreate customerDAOCreate = new CustomerDAOCreateImpl();
        c = customerDAOCreate.createCustomer(register);
	}else {
		throw new BusinessException("Invalid Inputs");
	}
        return c;
		
	}

}
