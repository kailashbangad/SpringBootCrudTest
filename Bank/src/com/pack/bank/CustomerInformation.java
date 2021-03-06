package com.pack.bank;

public class CustomerInformation {

	private int customerId;
	private String customerName;
	private double billAmount;
	private int noOfIterms;
	private String branchName;
	public CustomerInformation(int customerId, String customerName, double billAmount, int noOfIterms,
			String branchName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
		this.noOfIterms = noOfIterms;
		this.branchName = branchName;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getNoOfIterms() {
		return noOfIterms;
	}
	public void setNoOfIterms(int noOfIterms) {
		this.noOfIterms = noOfIterms;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
