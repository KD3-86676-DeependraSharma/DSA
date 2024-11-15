package com.sunbeam;

import java.util.Scanner;

class Employee {
	
    int empid;
    String name;
    double salary;
    Employee next;
	
    public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
}
public class EmployeeLinkedList {
   private static Employee head = null;
   
   public static void addEmployee() {
	  Scanner sc = new Scanner(System.in);
	   System.out.println("Enter empid-");
	   int empid=sc.nextInt();
	   System.out.println("Enter name-");
	  String  name=sc.next();
	   System.out.println("Enter salary-");
	  double salary=sc.nextDouble();
	   
	   Employee newEmployee = new Employee(empid,name,salary);
	   Employee trav = head;
	   if(head == null)
		   head = newEmployee;
	   else {

		   while(trav.next!=null) {
			   trav=trav.next;
               } 
		   trav.next=newEmployee;	 
	 } System.out.println("Employee added..");
   }
   
   public static void displayEmployee() {
	   if(head==null) {
		   System.out.println("Employee not found..");
	   }
	    Employee trav = head;
	    System.out.println("Employee List-");
	    while(trav!=null) {
	    	System.out.println("Id:"+trav.empid+"Name:"+trav.name+"Salry"+trav.salary);
	    	trav=trav.next;
	    }
   }
   
   public static void searchEmployeeByName() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter name-");
	   String name=sc.next();
	   
	   Employee trav = head;
	   boolean found=false;
	   if(head == null)
		   System.out.println("Employee not found");
	   while(trav.next!=null) {
		   if(trav.name.equals(name)) {
			   System.out.println("Employee found..");
			   System.out.println("Id:"+trav.empid+"Name:"+trav.name+"Salry"+trav.salary);
			   found=true;
			   break;
		   }
		   trav=trav.next;
	   }
  }
   
   public static void deleteEmployeeByEmpid() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Empid-");
	    int empid=sc.nextInt();
	    
	    Employee trav=head;
	    Employee prev = null;
	    
	    while(trav!=null) {
	    	if(trav.empid==empid) {
	    		if(prev==null) {
	    			head=trav.next;
	    	}else {
	    		prev.next=trav.next;
	    		System.out.println("Deleted successful..");
	    	}
	   }
	    prev=trav;
	    trav=trav.next;
  }System.out.println("Employee not found..");  
   }
   public static void UpdateSalary() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter empid to update-");
	   int empid=sc.nextInt();
	   System.out.println("Enter new salary-");
	   double newsalary=sc.nextDouble();
	   
	   Employee trav=head;
	   while(trav!=null) {
		   if(trav.empid==empid) {
			   trav.salary=newsalary;
			   System.out.println("Update successfully..");
			   return;
		   }trav=trav.next;
	   }System.out.println("Employee not found..");
	   
   }
   public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int choice;
	    
	   
        
	   do {
		   System.out.println("0.Exit");
		   System.out.println("1.Add Employee");
		   System.out.println("2.Display Employee");
		   System.out.println("3.Search Employee by name");
		   System.out.println("4.Delete Employee by empid");
		   System.out.println("5.Update salary of Employee");
		    System.out.println("Enter choice");
		    choice=sc.nextInt();
		    
		   switch(choice) {
		   case 1:
			   System.out.println("----------------------------------------");
			   addEmployee();
			   System.out.println("----------------------------------------");
			   break;
		   case 2:
			   System.out.println("----------------------------------------");
			   displayEmployee();
			   System.out.println("----------------------------------------");
			   break;
		   case 3:
			   System.out.println("----------------------------------------");
			   searchEmployeeByName();
			   System.out.println("----------------------------------------");
			   break;
		   case 4:
			   System.out.println("----------------------------------------");
			   deleteEmployeeByEmpid();
			   System.out.println("----------------------------------------");
			   break;
		   case 5:
			   System.out.println("----------------------------------------");
			   UpdateSalary() ;
			   System.out.println("----------------------------------------");
			   break;
			   
		   }
	   }while(choice!=0);
	    

		}
   }


