package com.sunbeam;

public class Queue {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	private int size;
	
	public Queue() {
		head=null;
		size =0;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
//	
//	public boolean isFull() {
//		return head==size;   
//	}
	
	public void push(int value) {
		Node nn = new Node(value);
		nn.next=head;
		head=nn;
	}
	
	 public int peek() {
		   if(head == null) 
			  return -1;
		   return head.data;
	 }
	
	public void pop() {
		if(isEmpty()) 
		return;
		else if(head.next==null)
			head=null;
		else {
			Node trav = head;
			while(trav.next.next!=null)
				trav=trav.next;
			trav.next=null;
			
		}
	}
	
	public void display() {
		Node trav=head;
		System.out.print("Queue");
		while(trav!=null) {
		System.out.print(" "+trav.data);
		trav=trav.next;
	}System.out.println();
	System.out.println("Pop element-"+head.data);
	}

}
