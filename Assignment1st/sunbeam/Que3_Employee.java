package com.sunbeam;

import java.util.Scanner;

class Employee{
	int empid;
	String name;
	
	
	public Employee() {
		super();
	}


	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Que3_Employee {
	
	public static int Search(Employee arr[],int empid) {
		
		for (int i=0;i<arr.length;i++) {
			
			if(empid==arr[i].empid) {
				return i;
			}	
		}
		return -1;
	}
	
	public static int Search1(Employee arr[],String empname) {
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i].name.equals(empname)) {
				return i;
			}	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(1,"Deependra");
		arr[1]=new Employee(2,"Addiyogi");
		arr[2]=new Employee(3,"brahma");
		
		System.out.println("Enter Empid :");
		int empid=sc.nextInt();
		
		int indx=Search(arr,empid);
		if(indx!=-1) {
		   System.out.println("Index :"+indx);
		   System.out.println("Employee Founded :"+arr[indx].name);
		}
		else {
			System.out.println("Employee not founded ...");
		}
		
		System.out.println("Enter Name :");
		String empname=sc.next();
		
		int indx1=Search1(arr,empname);
		if(indx!=-1) {
		   System.out.println("Index :"+indx1);
		   System.out.println("Employee Founded :"+arr[indx1].name);
		}
		else {
			System.out.println("Employee not founded ...");
		}
		
	}
	
}
