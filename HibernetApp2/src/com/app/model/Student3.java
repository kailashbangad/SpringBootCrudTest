package com.app.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;



@Entity
@Table
public class Student3 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int stdId;
	@Column(name = "sname")
	private String stdName;
	@ElementCollection
	@CollectionTable(name = "stdproject", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "listindex")
	@Column(name = "listdata")
	private List<String> stdData=new ArrayList<String>();
	@ElementCollection
	@CollectionTable(name = "custitem", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "setindex")
	@Column(name = "setdata")
	
	private Set<String>custData=new HashSet<String>();
	@ElementCollection
	@CollectionTable(name = "maptitem", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "mapindex")
	
	@Column(name = "mapdata")
	private Map<Integer,String>Data=new TreeMap<Integer,String>();
	public Student3() {
		super();
	}
	public Student3(int stdId, String stdName, List<String> stdData, Set<String> custData, Map<Integer, String> data) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdData = stdData;
		this.custData = custData;
		Data = data;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public List<String> getStdData() {
		return stdData;
	}
	public void setStdData(List<String> stdData) {
		this.stdData = stdData;
	}
	public Set<String> getCustData() {
		return custData;
	}
	public void setCustData(Set<String> custData) {
		this.custData = custData;
	}
	public Map<Integer, String> getData() {
		return Data;
	}
	public void setData(Map<Integer, String> data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "Student3 [stdId=" + stdId + ", stdName=" + stdName + ", stdData=" + stdData + ", custData=" + custData
				+ ", Data=" + Data + "]";
	}
	
	
	

	

}
