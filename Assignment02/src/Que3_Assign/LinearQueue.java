package Que3_Assign;


public class LinearQueue {
	private int arr[];
	private int front,rear;
	private int SIZE;
	
	public LinearQueue(int size) {
		SIZE =size;
		arr=new int[SIZE];
		front=rear=0;
	}
	public void push(int value) {
		rear ++;
		arr[rear]=value;
	
	}
	public int pop() {
		int temp=arr[front+1];
		front ++;
		return temp;
	}
	public int peek() {
		return arr[front+1];
	}
	public boolean isEmpty() {
		return rear==front;
	}
	public boolean isFull() {
		return rear==SIZE -1;
	}
	
}

