package com.sunbeam;

public class BST {
  static class Node{
	  private int data;
	  private Node left,right;
	  
	  public Node(int value) {
		  data = value;
		  left = right =null;
	  }
  }
  private Node root;
  public BST() {
	  root = null;
  }
  
  public boolean isEmpty() {
	  return root ==null;
  }
  
  public void adddNode(int value,Node trav) {
	  Node newNode = new Node(value);
	  if(value < trav.data) {
		  if(trav.left==null) {
			  trav.left=newNode;
		  return;
		  }else
			  adddNode(value,trav.left);
	  }
	  else {
		  if(trav.right==null){
		  trav.right=newNode;
		  return;
	  }else
			  adddNode(value,trav.right);
  }
 }
      private  void inOrder(Node trav) {
    	  if(trav == null)
    		  return;
    	  
    	  inOrder(trav.left);
    	  System.out.println(" "+trav.data);
    	  inOrder(trav.right);
      }
      
      public void inOrder() {
    	  System.out.println("inOrder-");
    	  inOrder(root);
      }
}
