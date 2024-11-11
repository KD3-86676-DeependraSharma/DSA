package com.sunbeam;

import java.util.Scanner;

public class Que7_Rank {
	
	public static int Search(int arr[],int key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(key>=arr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,15,3,4,4,1};
		
		System.out.println("Enter key :");
		int key=sc.nextInt();
		
		int indx=Search(arr,key);
		
		System.out.println("Rank Of "+key+" is : "+indx);
	}
}
