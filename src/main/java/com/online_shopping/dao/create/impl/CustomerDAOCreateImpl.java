package com.online_shopping.dao.create.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.online_shopping.dao.create.CustomerDAOCreate;
import com.online_shopping.dao.dbutil.MySqlDbConnection;
import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;

public class CustomerDAOCreateImpl implements CustomerDAOCreate {

	@Override
	public int createCustomer(Register register) throws BusinessException {
		int c = 0;
		try(Connection connection = MySqlDbConnection.getConnection()){
			String sql = "insert into register(register_first_name,register_last_name, register_email, register_password) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, register.getRegister_first_name());
			preparedStatement.setString(2, register.getRegister_last_name());
			preparedStatement.setString(3, register.getRegister_email());
			preparedStatement.setString(4, register.getRegister_password());
			c = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			throw new BusinessException("Something went wrong contact admin");
		}
		return c;
	}

}
