/* 4 Check the given number is prime or not.
Input: n = 7
Output: Prime  */

#include <stdio.h>

void main()
{
	int no, i=2; // 3
	
	printf("Enter a number: ");
	scanf("%d", &no);
	
//	printf("prime");
	
	while (no > 1 )
	{
		no % i != 0 ;
	}
	
	printf("prime");
}