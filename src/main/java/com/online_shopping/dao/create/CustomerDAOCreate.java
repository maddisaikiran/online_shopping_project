package com.online_shopping.dao.create;

import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;

public interface CustomerDAOCreate {
	public int createCustomer(Register register) throws BusinessException;

}
