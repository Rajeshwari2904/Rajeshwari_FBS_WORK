//3. Write a C program to convert temperature from Celsius to Fahrenheit using the
//formula: F = (C *9/5) + 32

#include<stdio.h>
void main()
{
	int celcius = 40;
	float Fahrenheit;
	
	Fahrenheit = (celcius * 9.0/5) + 32;  //
	printf("The Conversion of %d degree Celcius to Fahrenheit is %d", celcius ,Fahrenheit);
	
}