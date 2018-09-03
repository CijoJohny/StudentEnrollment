package com.studenroll.dao;

import java.io.Serializable;
import java.util.List;

public class StudEnrollment implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2914894489590514989L;
	private String studentName;
	private int studentId;
	private String contactName;
	private String status;
	private List<Enrollment> studEnrollment;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Enrollment> getStudEnrollment() {
		return studEnrollment;
	}
	public void setStudEnrollment(List<Enrollment> studEnrollment) {
		this.studEnrollment = studEnrollment;
	}
	

}
