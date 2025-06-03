//3. Write a program to check whether a given year is a leap year.

/*A year is a leap year if:

It is divisible by 4 and not divisible by 100, or

It is divisible by 400 */

#include <stdio.h>
 void main()
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
