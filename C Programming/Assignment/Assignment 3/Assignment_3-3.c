/* 3 Sum of numbers in given range.
Find sum of numbers from start to end.
Input: start = 1, end = 5
Output: 15   */

#include <stdio.h>

void main()
{
	int start, end, Sum=0;
	printf("Start: ");
	scanf("%d", &start);
	
	printf("End: ");
	scanf("%d", &end);
	
	
	while( start <= end)
	{
		Sum = Sum + start;
		start++;
	}
	
	printf("Sum : %d", Sum);
}
