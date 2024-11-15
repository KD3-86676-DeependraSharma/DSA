
public class stack {
  private int arr[];
  private int top;
  private final int SIZE;
  
  public stack(int size) {
	SIZE = size;
	top = -1;
	arr=new int[size];
}
  public stack() {
	this.SIZE = 0;
	
}
public void push(int value) {
	  top ++;
	  arr[top]=value;
  }
  public int pop() {
	  int temp = arr[top];
	  top --;
	  return temp;
  }
}
