// Assignment 1 Using Functions

//3. Write a program to check whether a given year is a leap year.


#include <stdio.h>

void leapYearOrNot();     // Function declaration

void main()
{
 	
 	leapYearOrNot();      // Function Call
 	
}
 
void leapYearOrNot()           // Function Definition
{
	int year = 2000;
 	
 	if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
 	{
 		printf("%d is a leap year", year);
	}
	else
	{
		printf("%d is not a leap year", year);
	}
}