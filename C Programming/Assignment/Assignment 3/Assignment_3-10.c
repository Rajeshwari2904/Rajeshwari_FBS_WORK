/* 10 Find Sum of first and last digit of given number.
Input: n = 12345
Output: 6 (1 + 5)  */

#include <stdio.h>

void main()
{
	int no = 12345;
	int last_digit = no% 10, first_digit, Sum;
	
	while(no > 0)
	{
		first_digit = no % 10;
		no = no / 10;
	}
	
	Sum = first_digit + last_digit;
	printf("Sum = %d", Sum);
}