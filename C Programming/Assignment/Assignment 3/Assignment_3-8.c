/* 8 Check the given number is Strong number or not.
Input: n = 145
Output: Strong  */  //eg. 145 = 1! + 4! + 5! = 145

#include <stdio.h>

void main()
{
	int no = 145, rem, sum =0;
	int original = no;
	
	while(no > 0)
	{
		rem = no % 10;
		
		 int fact=1;
		 while(no > 1)
		 {
		 	fact = fact * rem;
		 	rem--;
		 }
		 
		sum = sum + fact;
		no = no /10;
		 
		printf("Sum = %d", sum);
	
	}
	
		if( original == sum)
	{
		printf("%d is a Strong Number", original);
	}
	
}


