// Test 1

// WAP to check if the year is leap or not

#include <stdio.h>
void main()
{
	int year;
	printf("Enter Year: ");
	scanf("%d", &year);
	
	if( year % 4==0 ||  year % 100!=0  && year % 400==0)
	{
		printf("%d is a leap year", year);
	}
	
	else
	{
		printf("%d is not a leap year", year);
	}
}