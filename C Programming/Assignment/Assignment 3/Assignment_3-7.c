/* 7 Find factorial of given number.
Input: n = 5
Output: 120  */

#include <stdio.h>

void main()
{
	int no = 5, sum = 0;
	int fact = 1;
	int original =no;
	
	while(no > 1)
	{
		fact = fact * no;
		no--;
	}
	sum = sum + fact;
	printf("Factorial of %d is : %d", original, sum);
}
