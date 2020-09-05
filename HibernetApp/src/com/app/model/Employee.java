package com.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empId")
	private int eid;
	
	@Column(name = "empName")
	private String ename;
	@Column(name = "empSal")
	private Integer esal;
	@Column(name = "empCity")
	private String ecity;
}
