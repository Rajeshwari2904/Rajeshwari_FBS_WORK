/* 1. Print a solid square pattern
Input: n = 4
Output:
* * * *
* * * *
* * * *
* * * *   */

#include <stdio.h>

void main()
{
	int row = 4, column = 4;
	
	for(int i = 1; i<=row; i++)
	{
		for(int j = 1; j <= column; j++)
		{
			printf("* ");
		}
		
		printf("\n");
	}
}