package com.laboratory.management.pojo;

//课程类

public class Course {
	
	private String courseId; //课程代码
	
	private String courseName; //课程名称
	
	private String courseType; //课程类型
	
	private String courseCampus; //课程校区
	
	private String courseInstite; //课程学院
	
	private int courseStudentNumber; //课程学生
	
	//private String courseWeekType; //课程单双周
	
	private String courseStartEndTime; //课程起始结束时间
	
	private int courseTotalCredit; //课程总学分
	
	private int courseExperimentTime; //实验学时
	
	private int courseExperimentCredit; //实验学分

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseCampus() {
		return courseCampus;
	}

	public void setCourseCampus(String courseCampus) {
		this.courseCampus = courseCampus;
	}

	public String getCourseInstite() {
		return courseInstite;
	}

	public void setCourseInstite(String courseInstite) {
		this.courseInstite = courseInstite;
	}

	public int getCourseStudentNumber() {
		return courseStudentNumber;
	}

	public void setCourseStudentNumber(int courseStudentNumber) {
		this.courseStudentNumber = courseStudentNumber;
	}
	
	/*

	public String getCourseWeekType() {
		return courseWeekType;
	}

	public void setCourseWeekType(String courseWeekType) {
		this.courseWeekType = courseWeekType;
	}


    */
	public String getCourseStartEndTime() {
		return courseStartEndTime;
	}

	public void setCourseStartEndTime(String courseStartEndTime) {
		this.courseStartEndTime = courseStartEndTime;
	}

	public int getCourseTotalCredit() {
		return courseTotalCredit;
	}

	public void setCourseTotalCredit(int courseTotalCredit) {
		this.courseTotalCredit = courseTotalCredit;
	}

	public int getCourseExperimentTime() {
		return courseExperimentTime;
	}

	public void setCourseExperimentTime(int courseExperimentTime) {
		this.courseExperimentTime = courseExperimentTime;
	}

	public int getCourseExperimentCredit() {
		return courseExperimentCredit;
	}

	public void setCourseExperimentCredit(int courseExperimentCredit) {
		this.courseExperimentCredit = courseExperimentCredit;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseType=" + courseType
				+ ", courseCampus=" + courseCampus + ", courseInstite=" + courseInstite + ", courseStudentNumber="
				+ courseStudentNumber + ", courseStartEndTime="
				+ courseStartEndTime + ", courseTotalCredit=" + courseTotalCredit + ", courseExperimentTime="
				+ courseExperimentTime + ", courseExperimentCredit=" + courseExperimentCredit + "]";
	}
	
	
}
