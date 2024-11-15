package com.sunbeam;

public class Stack {
 static class  Node{
	private int data;
	private Node next;
	
	public Node(int value) {
		data = value;
		next=null;
	}	
 }
   private Node head ;
   
   public Stack() {
	head=null;
 }
   public boolean isEmpty() {
	   return head == null ;
   }
   
   
   public void push(int value) {
	   Node nn = new Node(value);
	  nn.next=head;
	  head=nn;
	  
 }
   public int pop() {
	   if(isEmpty()) {
		   return -1;
	   }
	   int value = head.data;
	   head=head.next;
	   return value;
	  
   }
   
   public int peek() {
	   if(head == null) 
		  return -1;
	   return head.data;
				 
			
	  }
   public void display() {
	   Node trav = head;
	   System.out.println("Stack-");
	  while(trav!=null){ 
	   System.out.println(" "+trav.data);
	   trav=trav.next;
	  }
	  System.out.println();
	  System.out.println("pop-"+head.data);
   }
   
}
