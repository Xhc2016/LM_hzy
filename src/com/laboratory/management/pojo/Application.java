package com.laboratory.management.pojo;

//import java.sql.Date;

public class Application {
	
	private String applicationId; //申请编号 应该随机生成
	
	private User user; //教师编号
	
	private Course course; //课程编号
	
	private String softwareRequirement; //实验软件需求
	
	private String idealTime1; //理想时间1
	
	private String idealTime2;
	
	private String applicationRemark; //申请备注
	
	private String applicationState; //申请受理情况
	
	private String applicationTime; //申请时间

	/**
	 * @return applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId 要设置的 applicationId
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user 要设置的 user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course 要设置的 course
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return softwareRequirement
	 */
	public String getSoftwareRequirement() {
		return softwareRequirement;
	}

	/**
	 * @param softwareRequirement 要设置的 softwareRequirement
	 */
	public void setSoftwareRequirement(String softwareRequirement) {
		this.softwareRequirement = softwareRequirement;
	}

	/**
	 * @return idealTime1
	 */
	public String getIdealTime1() {
		return idealTime1;
	}

	/**
	 * @param idealTime1 要设置的 idealTime1
	 */
	public void setIdealTime1(String idealTime1) {
		this.idealTime1 = idealTime1;
	}

	/**
	 * @return idealTime2
	 */
	public String getIdealTime2() {
		return idealTime2;
	}

	/**
	 * @param idealTime2 要设置的 idealTime2
	 */
	public void setIdealTime2(String idealTime2) {
		this.idealTime2 = idealTime2;
	}

	/**
	 * @return applicationRemark
	 */
	public String getApplicationRemark() {
		return applicationRemark;
	}

	/**
	 * @param applicationRemark 要设置的 applicationRemark
	 */
	public void setApplicationRemark(String applicationRemark) {
		this.applicationRemark = applicationRemark;
	}

	/**
	 * @return applicationState
	 */
	public String getApplicationState() {
		return applicationState;
	}

	/**
	 * @param applicationState 要设置的 applicationState
	 */
	public void setApplicationState(String applicationState) {
		this.applicationState = applicationState;
	}

	/**
	 * @return applicationTime
	 */
	public String getApplicationTime() {
		return applicationTime;
	}

	/**
	 * @param applicationTime 要设置的 applicationTime
	 */
	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", user=" + user + ", course=" + course
				+ ", softwareRequirement=" + softwareRequirement + ", idealTime1=" + idealTime1 + ", idealTime2="
				+ idealTime2 + ", applicationRemark=" + applicationRemark + ", applicationState=" + applicationState
				+ ", applicationTime=" + applicationTime + "]";
	}
	
	

	
}
