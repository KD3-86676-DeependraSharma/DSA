package com.sunbeam;

import java.util.Scanner;

public class Que5_nth_occurence {
	
	public static int Search(int arr[],int key ,int n) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				count++;
			}
			if(count==n) {
				return i;
			}
		}
		return -1;
			
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int arr[]= {10,20,30,50,20,60,30,20};
		
		System.out.println("Enter key :");
		int key=sc.nextInt();
		
		System.out.println("Enter Nth Occurence :");
		int n=sc.nextInt();
		
		int indx=Search(arr,key,n);
		if(indx!=-1) {
		    System.out.println("Nth occurence index is:"+indx);
		}
		else {
			System.out.println(n+" is Given Occurence not founded ...");
		}
	}
}
