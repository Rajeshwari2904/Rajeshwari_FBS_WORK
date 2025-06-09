/* 6 Check the given number is Perfect number or not.
Input: n = 28
Output: Perfect  */  //eg. 6 ke divisors 1 + 2 + 3 = 6

#include <stdio.h>

void main()
{
	int no = 6, sum =0;
	int i =1;
	
	while( i< no)
	{
		if( no % i ==0)
		{
			sum = sum + i;
		}
		i++;
	}
	
	if( no == sum)
	printf("Perfect");
}