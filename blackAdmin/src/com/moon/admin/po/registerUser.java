package com.moon.admin.po;

public class registerUser extends User {
	
    private String pwd_confirm;
    
    public String getPwd_confirm() {
    	return pwd_confirm;
    }

	public void setPwd_confirm(String pwd_confirm) {
    	this.pwd_confirm = pwd_confirm;
    }

}
