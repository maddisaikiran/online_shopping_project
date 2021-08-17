package com.online_shopping;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.online_shopping.Main;
import com.online_shopping.dao.login.CustomerLoginDAO;
import com.online_shopping.dao.login.impl.CustomerLoginDAOImpl;
import com.online_shopping.exception.BusinessException;
import com.online_shopping.model.Register;
import com.online_shopping.service.create.CreateFunctionality;
import com.online_shopping.service.create.impl.CreateFunctionalityImpl;
import com.online_shopping.service.login.CustomerServiceLogin;
import com.online_shopping.service.login.impl.CustomerServiceLoginImpl;


public class Main {
	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
		 int ch = 0;
		 do {
	 log.info("");
         log.info("-----------------------------");
           log.info("    Welcome To Online Shopping");
	            log.info("-----------------------------");
	            log.info("Select Any 1 option...");
            log.info("1)register ");
	            log.info("2) login  ");
	            try {
                ch = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                log.warn(e);
	            }
	            switch(ch) {
	            case 1:
	          
					log.info("Enter First Name");
					String RegisterFirstName = scanner.nextLine();
					log.info("Enter Last Name");
					String RegisterLastName = scanner.nextLine();
					log.info("Enter Email");
					String RegisterEmail = scanner.nextLine();
					log.info("Enter Password");
					String RegisterPassword = scanner.nextLine();
					Register register = new Register(RegisterFirstName,RegisterLastName,RegisterEmail,RegisterPassword);
	                  
					
					int c = 0;
	                   CreateFunctionality createFunctionality = new CreateFunctionalityImpl();
	                   try{
	                	   c = createFunctionality.createCustomer(register);
	                   }  catch (BusinessException e) {
	                       log.warn(e.getMessage());
	                       log.info("\nReturning to Main Menu...");
	                   }
                      if (c == 1) {
                          log.info("registered successfully!!!");
                    
                           log.info("\nReturning to Main Menu. ");
                       }
                      break;
            case 2:
	            	  int userType = 0;
					do {
					log.info("1)Customer login");
					log.info("2)Employee login");
						log.info("3)return to Main");
						try {
							userType = Integer.parseInt(scanner.nextLine());
					}catch(NumberFormatException e) {
						
						}
						switch(userType) {
						             case 1:
						            	// Register register = null;
	            	
	            	        do {
						             log.info("welcome to login page");
	            	                log.info("Enter your email : ");
	                               String registeremailid = scanner.nextLine();
	                              log.info("Enter your password : ");
	                              String registerpassord = scanner.nextLine();
	                              CustomerServiceLogin customServiceLogin= new CustomerServiceLoginImpl();
	                                     try {
               	                          register = customServiceLogin.customerLogin(registeremailid, registerpassord);
	                	                     if(register.getRegister_first_name()!=null) {
							                log.info("================================");
							            log.info("Login Successfull             ||");
							             log.info("Welcome user " + register.getRegister_first_name() + "           ||");
								              log.info("================================");
	                   }
	                	                     else {
						                      	log.info("Email and password didn't match");
						                             }
	                                     }
                	                catch (BusinessException e) {				             
						            log.error(e.getMessage());
           	        }
			                         }
	                                  while(userType!=3);
                             break;
						}
					} while(false);
	            break;
            }
	            

						}while(ch != 3);
					}
	            }