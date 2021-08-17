package com.online_shopping.service.create;

import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;

public interface CreateFunctionality {
	public int createCustomer(Register register) throws BusinessException;

}
