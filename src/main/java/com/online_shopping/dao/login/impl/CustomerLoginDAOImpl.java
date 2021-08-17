package com.online_shopping.dao.login.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.online_shopping.dao.dbutil.MySqlDbConnection;
import com.online_shopping.dao.login.CustomerLoginDAO;
import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;

public class CustomerLoginDAOImpl implements CustomerLoginDAO {
	 private static Logger log = Logger.getLogger(CustomerLoginDAOImpl.class);

	@Override
	public Register customerLogin(String register_email, String register_password) throws BusinessException {
		Register register = new Register();
		try(Connection connection = MySqlDbConnection.getConnection()){
			String sql = "select register_id, register_first_name, register_last_name, register_email, register_password from register where register_email=? and register_password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, register_email);
			preparedStatement.setString(2, register_password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				register.setRegister_id(resultSet.getInt("register_id"));
				register.setRegister_first_name(resultSet.getString("register_first_name"));
				register.setRegister_last_name(resultSet.getString("register_last_name"));
				register.setRegister_email(resultSet.getString("register_email"));
				register.setRegister_password(resultSet.getString("register_password"));
			}
		}catch(ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Some Internal Error Occured contact Sys admin");
		}
		return register;
	}

}
