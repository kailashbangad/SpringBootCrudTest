package com.pack.bank;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		CustomerInformation[] ci=new CustomerInformation[4];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<ci.length;i++) {
				int customerId=sc.nextInt();sc.nextLine();
				String customerName=sc.nextLine();
				double billAmount=sc.nextDouble();sc.nextLine();
				int noOfIterms=sc.nextInt();sc.nextLine();
				String branchName=sc.nextLine();
				ci[i]=new CustomerInformation(customerId, customerName, billAmount, noOfIterms, branchName);
				
			}
		} catch (Exception e) {
		}
		
		String branchName=sc.nextLine();
		double billAmount=sc.nextDouble();sc.nextLine();
		String StartingLetterOfName=sc.nextLine();
		
		int avg=findAvgBillByBranc(ci, branchName);
		if(avg>0)
			System.out.println(avg);
		else
			System.out.println("There are no customer purchase in that perticular branch ");
		
		CustomerInformation result =discountByBillAmount(ci, billAmount, StartingLetterOfName);
		if(result!=null)
			System.out.println(result.getCustomerName()+""+result.getBillAmount());
		else
			System.out.println("NO");
		
	}
	
	public static int findAvgBillByBranc(CustomerInformation[] ci,String branchName) {
		int avg=0,count=0,sum=0;
		for(int i=0;i<ci.length;i++) {
			if(ci[i].getBranchName().equalsIgnoreCase(branchName)) {
				sum=(int) (sum + ci[i].getBillAmount());
				count++;
			}
			
			
		}
		if(count!=0) {
		avg=sum/count;
		return avg;
		}
		else 
			return 0;
		
	}
	 
	public static CustomerInformation discountByBillAmount(CustomerInformation[] ci,double billAmount,String StartingLetterOfName) {
		CustomerInformation m=null;
		double discount;
		
		for(int i=0;i<ci.length;i++) {
			String fp=ci[i].getCustomerName().toLowerCase();
			String fd=StartingLetterOfName.toLowerCase();
			
			char str=fp.charAt(0);
			char str1=fd.charAt(0);
			if(str==str1) {
				if(ci[i].getBillAmount()>=billAmount) {
				discount=ci[i].getBillAmount()-((ci[i].getBillAmount()*20)/100);
				ci[i].setBillAmount(discount);
				m=ci[i];
			}
			else {
				discount=ci[i].getBillAmount()-((ci[i].getBillAmount()*10)/100);
				ci[i].setBillAmount(discount);
				m=ci[i];
			}
		}
		}
		if(m==null)
		return null;
		else
		return m;
		
	}

}
