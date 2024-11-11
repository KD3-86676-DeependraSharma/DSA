package com.sunbeam;

import java.util.Scanner;

public class Que2_2_NoOfComp_BinarySearch {
	
	public static int BinarySearch(int arr[],int value) {
		int left=0;
		int right=arr.length;
		int mid;
		
		int count=0;
		while(left<=right) {
			mid=(left+right)/2;
			count++;
//			System.out.println(arr[mid]);
//			System.out.println("Total comparision :"+count);
			if(value==arr[mid]) {
				return count;
			}
			else if(value<arr[mid]) {
				right=mid-1;
			
			}
			else if(value>arr[mid]) {
				left=mid+1;
			}			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,66,90};
		
		System.out.println("Enter key :");
		int key=sc.nextInt();
		
		int index=BinarySearch(arr,key);
		
		System.out.println("comperision count :"+index);
//		System.out.println("Input value index is :"+index);
//		System.out.println("Input value :"+arr[index]);
	}

}
