package com.laboratory.management.pojo;

public class PassedClass 
{
	private Integer passedClassId;
	
	private User user;
	
	private Course course;
	
	private Integer classWeekType;//0 1 2
	
	private String classWeekRange;//
	
	private String classWeek;
	
	private String classTime;
	
	private Classroom classroom;

	private String passedTime;

	/**
	 * @return passedClassId
	 */
	public Integer getPassedClassId() {
		return passedClassId;
	}

	/**
	 * @param passedClassId 要设置的 passedClassId
	 */
	public void setPassedClassId(int passedClassId) {
		this.passedClassId = passedClassId;
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
	 * @return classWeekType
	 */
	public Integer getClassWeekType() {
		return classWeekType;
	}

	/**
	 * @param classWeekType 要设置的 classWeekType
	 */
	public void setClassWeekType(int classWeekType) {
		this.classWeekType = classWeekType;
	}

	/**
	 * @return classWeekRange
	 */
	public String getClassWeekRange() {
		return classWeekRange;
	}

	/**
	 * @param classWeekRange 要设置的 classWeekRange
	 */
	public void setClassWeekRange(String classWeekRange) {
		this.classWeekRange = classWeekRange;
	}

	/**
	 * @return classWeek
	 */
	public String getClassWeek() {
		return classWeek;
	}

	/**
	 * @param classWeek 要设置的 classWeek
	 */
	public void setClassWeek(String classWeek) {
		this.classWeek = classWeek;
	}

	/**
	 * @return classTime
	 */
	public String getClassTime() {
		return classTime;
	}

	/**
	 * @param classTime 要设置的 classTime
	 */
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}

	/**
	 * @return classroom
	 */
	public Classroom getClassroom() {
		return classroom;
	}

	/**
	 * @param classroom 要设置的 classroom
	 */
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	/**
	 * @return passedTime
	 */
	public String getPassedTime() {
		return passedTime;
	}

	/**
	 * @param passedTime 要设置的 passedTime
	 */
	public void setPassedTime(String passedTime) {
		this.passedTime = passedTime;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PassedClass [passedClassId=" + passedClassId + ", user=" + user + ", course=" + course
				+ ", classWeekType=" + classWeekType + ", classWeekRange=" + classWeekRange + ", classWeek=" + classWeek
				+ ", classTime=" + classTime + ", classroom=" + classroom + ", passedTime=" + passedTime + "]";
	}
	
	
}
