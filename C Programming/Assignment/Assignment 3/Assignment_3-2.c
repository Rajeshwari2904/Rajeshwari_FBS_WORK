/* 2 Print table for given number.
Input: n = 5
Output: 5 10 15 20 25 30 35 40 45 50  */

#include <stdio.h>

void main()
{
	int i = 1, n, table;
	
	printf("Enter a number: ");
	scanf("%d", &n);
	
	while(i <= 10 )
	{
		table = i * n;
		printf("%d\n", table);
		i++; 
	}
	
}