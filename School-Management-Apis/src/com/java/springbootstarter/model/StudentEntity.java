package com.java.springbootstarter.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable, Cloneable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "STUDENT_ID")
	private Long studentId;
    
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "STUDENT_ADDRESS")
	private String studentAddress;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setCompanyName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setCompanyAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

      

}
