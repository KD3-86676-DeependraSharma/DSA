package com.sunbeam;

import java.util.Scanner;

public class Que2_1_NoOfComp_LinearSearch {
	
	public static void comparision(int arr[],int value) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=count+1;
			if(value==arr[i]) {
			    System.out.println(arr[i]);
			    break;
			}
			
		}
		System.out.println("number of comperision :"+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[]= {22,88,33,66,55,44};
		
//		System.out.println(arr);
		
		System.out.println("Enter key :");
		int key=sc.nextInt();
		
		comparision(arr,key);
		
	}
}
