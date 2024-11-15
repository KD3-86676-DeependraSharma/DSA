package com.sunbeam;

public class SinglyCircularLinkedList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		l1.addLast(40);
		l1.addLast(50);
		l1.addLast(60);
		
	//	l1.deleteFirst();
		// l1.deleteLast();
		l1.deletePosition(4);
	//	l1.addPostion(25, 3);
		
		l1.display();
	}

}
