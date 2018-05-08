package org.koushik.javabrains.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;


public class LogInAction  extends ActionSupport {
	
	private String userId;
	private String password;
	
	// BP-1: not use hard codded return string type instead use constant
	// or implement Action interface
	
	//private static String SUCCESS="success";
	
	public String execute(){
		if(getUserId().equals("userId") && getPassword().equals("password")){
			//return "success";
			return SUCCESS;
				
		}
		//return "failure";
		return LOGIN;
		
	}
	
	public void validate(){
		if (StringUtils.isEmpty(getUserId())){
			// user id blank
			addFieldError("userId", "User ID can't be blank");
		}
		
		if (StringUtils.isEmpty(getPassword())){
			// password blank
			addFieldError("password", "Password can't be blank");
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
