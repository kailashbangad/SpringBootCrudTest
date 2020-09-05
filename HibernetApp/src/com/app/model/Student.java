package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "stu")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int studentId;
	@Column(name = "sname")
	private String studentName;
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date dt1;
	@Temporal(TemporalType.TIME)
	@Column(name = "time")
	private Date dt2;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datetime")
	private Date dt3;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, Date dt1, Date dt2, Date dt3) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dt1 = dt1;
		this.dt2 = dt2;
		this.dt3 = dt3;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDt1() {
		return dt1;
	}
	public void setDt1(Date dt1) {
		this.dt1 = dt1;
	}
	public Date getDt2() {
		return dt2;
	}
	public void setDt2(Date dt2) {
		this.dt2 = dt2;
	}
	public Date getDt3() {
		return dt3;
	}
	public void setDt3(Date dt3) {
		this.dt3 = dt3;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dt1=" + dt1 + ", dt2=" + dt2
				+ ", dt3=" + dt3 + "]";
	}
	
	

}
