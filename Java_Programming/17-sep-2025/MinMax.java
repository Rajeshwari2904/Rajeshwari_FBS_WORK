import java.util.Scanner;

class MinMax {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size= sc.nextInt();
		
		int[] arr= new int[size];
		
		System.out.println("Enter Elements of array: ");
		for(int i=0; i < size; i++) {
			arr[i]= sc.nextInt();
		  }
		
		int min= arr[0];
		int max= arr[0];
		
		for(int i=0; i<size; i++) {
			if(arr[i] < min) {
				min = arr[i];
				System.out.println("Minimum Number in Array: "+ min);
			}
			if(arr[i] > max) {
				max = arr[i];
				System.out.println("Maximum  Number in array: "+max);
			}
		}
		
		
		

	}

}
