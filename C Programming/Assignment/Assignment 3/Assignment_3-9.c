/* 9 Check the given number is Palindrome number or not.
Input: n = 121
Output: Palindrome */

#include <stdio.h>

void main()
{
	int no, r1, r2;
	
	printf("Enter a 3 digit Number: ");  //121
	scanf("%d", &no);
	
	while( no != 0)
	{
	    r1 = no % 10;  //1
		r2 = no / 100;	//1
	}
	
	
	if( r1 == r2)
	{
		printf("Palindrome ");
	}
	
	else
	   printf("Not Palindrome ");
}