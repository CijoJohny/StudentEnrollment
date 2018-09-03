package com.studenroll.dao;

import java.io.Serializable;

public class Enrollment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String courseName;
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	private int courseId;
	
	private int mark;
	
	private String status;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
