package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer sid;
	@Column
	private String sname;
	@Column(name = "img")
	@Transient
	private byte[] simg;
	@Column(name = "txt")
	private char[]	stxt;
	public Student2() {
		super();
	}
	public Student2(Integer sid, String sname, byte[] simg, char[] stxt) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.simg = simg;
		this.stxt = stxt;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public byte[] getSimg() {
		return simg;
	}
	public void setSimg(byte[] simg) {
		this.simg = simg;
	}
	public char[] getStxt() {
		return stxt;
	}
	public void setStxt(char[] stxt) {
		this.stxt = stxt;
	}
	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", sname=" + sname + ", simg=" + Arrays.toString(simg) + ", stxt="
				+ Arrays.toString(stxt) + "]";
	}
	

}
