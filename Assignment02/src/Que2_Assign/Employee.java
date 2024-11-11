package Que2_Assign;

	import java.util.Arrays;

	public class Employee {
		private int empid;
		private int salary;
		
		
		public Employee(int empid, int salary) {
			this.empid = empid;
			this.salary = salary;
		}
		

		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}
		


		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", salary=" + salary + "]";
		}
			
		
		public static void main(String[] args) {

			
			Employee[] arr = new Employee[4];
			arr[0] = new Employee(1,2000);
			arr[1] = new Employee(1,6000);
			arr[2] = new Employee(1,4000);
			arr[3] = new Employee(1,8000);
			
				System.out.println("Employee before sorted-"+Arrays.toString(arr));
				
				selectionSort(arr,arr.length);
				
				System.out.println("Employee after sorted-"+Arrays.toString(arr));
				
			

		}


		private static void selectionSort(Employee[] arr, int N) {
			for(int i=1;i<N;i++) {
				int midind = i;
				for(int j = i+1;j<N;j++) {
					if (arr[j].getSalary()<arr[midind].getSalary())
	                midind = j;
				}
				Employee temp = arr[midind];
				arr[midind]=arr[i];
				arr[i]=temp;
			}
			
		}
		
	}

