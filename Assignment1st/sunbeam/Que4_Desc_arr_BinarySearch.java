package com.sunbeam;

import java.util.Scanner;

public class Que4_Desc_arr_BinarySearch {
	
	public static int DescBinarySearch(int arr[],int key) {
		
		int left=0;
		int right=arr.length;
		int mid;
		
		while(left<=right) {
			
			mid=(left+right)/2;
			
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				left=mid+1;
				
			}
			else if(key>arr[mid]) {
				right=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {50,40,30,20,10,5};
		
		System.out.println("enter key :");
		int key=sc.nextInt();
		
		int indx=DescBinarySearch(arr,key);
		
		System.out.println("index :"+indx);
		
	}

}
