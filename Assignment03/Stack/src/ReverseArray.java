import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {

	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		System.out.println("before reverse-"+Arrays.toString(arr));
		
		reverseArray(arr);
		
		System.out.println("after reverse-"+Arrays.toString(arr));
		
	}

	private static void reverseArray(int[] arr) {
		Stack <Integer> s = new Stack<>();

      for(int value : arr)
    	  s.push(value);
    
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.pop();
	}
	}
}

