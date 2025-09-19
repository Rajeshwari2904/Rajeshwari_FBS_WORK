import java.util.Scanner;

class SearchNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int[] arr= {2,4,8,3,1};
		
		System.out.println("Enter a Number: ");
		int no = sc.nextInt();
		int flag=0;
		
		for(int i =0; i <arr.length; i++) {
			
			if(arr[i] == no) {
				
				flag =1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Number is found.");
			 
		else
				System.out.println("Number not found.");
			

	}

}
