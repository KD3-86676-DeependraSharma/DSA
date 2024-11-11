package com.sunbeam;

import java.util.Scanner;

public class Que_1_LenearSearchLastOccurance {
	
	public static int LenearSearch(int arr[],int value) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(value==arr[i]) {
				System.out.println(arr[i]);
				index=i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {22,11,20,66,55,44,66,77,88};
		
		System.out.println("Enter key :");
		int key=sc.nextInt();
		
		int indx=LenearSearch(arr,key);
		
		if(indx==-1) {
			System.out.println("key not found...");
		}
		else {
			System.out.println("key founded ... index is :"+indx);
		}
		
		

	}

}
