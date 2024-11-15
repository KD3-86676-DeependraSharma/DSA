package com.sunbeam;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.push(40);
		q.push(30);
		q.push(20);
		q.push(10);
		
		q.pop();
	//	q.peek();
		
		q.display();

	}

}
