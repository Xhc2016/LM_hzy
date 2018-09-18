package com.laboratory.management.pojo;

/**
 * @author 13986
 * 2018-7-30
 * 9：54
 *
 */
public class User {
	
	private String userId;
	
	private String phoneNumber;
	
	private String email;
	
	private String  institute;//college
	
	private Integer role;//0 管理员 1 授课教师 2领导
	
	private String password;
	
	private String fullName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", phoneNumber=" + phoneNumber + ", email=" + email + ", institute=" + institute
				+ ", role=" + role + ", password=" + password + ", fullName=" + fullName + "]";
	}
	
	
	

}
