package com.moon.admin.po;

public class ActiveUser implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
	public String getUserid() {
    	return userid;
    }
	public void setUserid(String userid) {
    	this.userid = userid;
    }
	public String getUsername() {
    	return username;
    }
	public void setUsername(String username) {
    	this.username = username;
    }
	public String getGroupid() {
    	return groupid;
    }
	public void setGroupid(String groupid) {
    	this.groupid = groupid;
    }
	public String getGroupname() {
    	return groupname;
    }
	public void setGroupname(String groupname) {
    	this.groupname = groupname;
    }
	private String userid;//用户id
	private String username;//用户名称
	private String groupid;//用户类型
	private String groupname;//用户类型名称
}
