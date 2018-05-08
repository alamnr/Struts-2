package org.koushik.javabrains.action;

import org.apache.commons.lang3.StringUtils;
import org.koushik.javabrains.model.User;
import org.koushik.javabrains.service.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.net.httpserver.Authenticator.Success;


public class LogInAction  extends ActionSupport  implements ModelDriven<User>{
	
	/*private String userId;
	private String password;*/
	
	//private User user ;
	
	private User user = new User();
	
	// BP-1: not use hard codded return string type instead use constant
	// or implement Action interface
	
	//private static String SUCCESS="success";
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute(){
		
		LoginService loginService = new LoginService();
		/* user = new User();
		user.setUserId(getUserId());
		user.setPassword(getPassword());*/
		
		if(loginService.verifyLogin(user)){
			//return "success";
			return SUCCESS;
				
		}
		//return "failure";
		return LOGIN;
		
	}
	
	public void validate(){
		if (StringUtils.isEmpty(user.getUserId())){
			// user id blank
			addFieldError("userId", "User ID can't be blank");
		}
		
		if (StringUtils.isEmpty(user.getPassword())){
			// password blank
			addFieldError("password", "Password can't be blank");
		}
	}

	@Override
	public User getModel() {
		
		return user;
	}

	/*public String getUserId() {
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
*/
}
