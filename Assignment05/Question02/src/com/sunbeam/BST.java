package com.sunbeam;

public class BST {
   static class Node{
	   private int data;
	   private Node left,right;
	   
	   public Node(int value) {
		   data=value;
		   left=right=null;
	   }
   }
   private  Node root;
   
   public BST() {
	   root = null;
   }
   
   Node BinarySearchRec(int key,Node trav) {
	   if(trav ==null)
		   return null;
	   if(key ==trav.data)
		   return trav;
   else if(key<trav.data)
	return   BinarySearchRec(key,trav.left);
   else
	   return   BinarySearchRec(key,trav.right);
   }
}
