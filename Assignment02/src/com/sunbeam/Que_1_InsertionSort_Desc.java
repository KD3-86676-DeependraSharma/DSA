package com.sunbeam;
import java.util.Arrays;
public class Que_1_InsertionSort_Desc {
	
	     public static void insertionSort(int arr[],int N) {
	    	  for(int i=1;i<N;i++) {
	    		  int temp =arr[i];
	    		  int j;
	    		  for(j=i-1;j>=0 && arr[j]<temp;j--) {
	    		 arr[j+1]=arr[j];
	   			  arr[j]=temp;
	    		  } 
	    	  }
	     }
		public static void main(String[] args) {
			int arr[]= {11,55,44,66,33};
			System.out.println("Arrays before sorted-"+Arrays.toString(arr));
			insertionSort(arr,arr.length);
			System.out.println("Arrays after sorted-"+Arrays.toString(arr));
		}

	}
