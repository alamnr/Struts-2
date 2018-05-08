package org.koushik.javabrains.action;

import com.opensymphony.xwork2.Action;
import com.sun.net.httpserver.Authenticator.Success;

public class LogInAction  implements Action {
	
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
