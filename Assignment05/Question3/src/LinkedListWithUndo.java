import java.util.Stack;

public class LinkedListWithUndo {
  static class Node{
	  private int data;
	  private Node next;
	  
	  public Node(int value) {
		data=value;
		next=null;
	}
  }
  static Node head=null;
  static Stack<Node> stackundo=new Stack<>();
  
  public static void addNode(int value) {
	  Node nn = new Node(value);
	  
	  if(head==null)
	  head=nn;
	  else {
		  Node trav=head;
		while(trav.next!=null) {
			trav=trav.next;
		}trav.next=nn;
	  }stackundo.push(head);
  }
    public static void deleteNode(int value) {
    	Node trav = head,prev=null;
    	while(trav!=null && trav.data!=value) {
    	prev = trav;
    	trav=trav.next;
    	}
    	if(trav == null) {
    		System.out.println("Element not found..");
    		return;
    	}
    	if(prev == null) {
    		
    	}
    }
  
}
