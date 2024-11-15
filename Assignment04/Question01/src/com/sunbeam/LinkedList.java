package com.sunbeam;

public class LinkedList {
   static class Node{
	   private int data;
	   private Node next;
	   
	   public Node(int value) {
		   data=value;
		   next=null;
	   }
   }
   private Node tail;
   private int size;
   public LinkedList() {
	   tail=null;
	   int size =0;
   }
   
   public boolean isEmpty() {
	   return  tail == null;
   }
   
   public int size() {
	   return size;
   }
   
   public void addFirst(int value) {
	   Node newnode = new Node(value);
        if(isEmpty()) {
        tail=newnode;
        tail.next=tail;
        }else {
        	newnode.next=tail.next;
        	tail.next=newnode;
        }size ++;
   }
   
   public void addLast(int value) {
	   Node nn= new Node(value);
       if(isEmpty()) {
    	   tail=nn;
	       tail.next=tail;
       }else {
    	  nn.next=tail.next;
    	  tail.next=nn;
    	  tail=nn;
       }size ++;
   }
   
   public void addPostion(int value,int pos) {
	   if(pos<1 || pos>size+1) 
	   return;
	   Node nn= new Node(value);
	   if(isEmpty()) {
		   tail=nn;
		   tail.next=tail;
	   }else if (pos == 1){
		   addFirst(value);
		   return;
	   }else if(pos == size +1) {
		   addLast(value);
		   return;
	   }else {
		   Node trav=tail.next;
		   for(int i=1;i<pos-1;i++) 
			   trav=trav.next;
		   nn.next=trav.next;
		   trav.next=nn;
	   }size++;
   }
   
   public void deleteFirst() {
	   if(isEmpty())
		   return;
	   else if(size == 1) {
		   tail=null;
   }else {
	   tail.next=tail.next.next;
   }size --;
   }
   
   public void deleteLast() {
	   if(isEmpty()) 
		   return;
		   else if(size == 1)
			   tail =null;
		   else {
			   Node trav = tail.next;
			  while(trav.next != tail )
				  trav=trav.next;
			  trav.next=tail.next;tail=trav;
	   }size --;
   }
   
   public void deletePosition(int pos) {
	   if(pos < 1 || pos > size)
		   return;
	   if (tail == null)
		   return;
	   else if(tail.next==tail)
		   tail=null;
	   else if(pos == 1) {
		   deleteFirst();
		   return;
	   }else if(pos == size) {
		   deleteLast();
		   return;
	   }else {
		  Node trav = tail.next;
		  for(int i=1;i<pos -1;i++)
			  trav=trav.next;
		  trav.next=trav.next.next;
	   }size --;
   }
   public void display() {
	   if(isEmpty()) 
	    return;
	   Node trav = tail.next;
	   System.out.println("List-");
	   do {
		   System.out.print(" "+trav.data);
		   trav=trav.next;
	   }while(trav!= tail.next);
	   System.out.println();
	   System.out.println("last node-"+tail.data);
   }
   }
