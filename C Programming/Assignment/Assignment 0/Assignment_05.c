//5. Write a C program to input five numbers and find their average.

#include<stdio.h>
void main()
{
	int a=10, b=20, c=25, d=30, e=15;
	
	int Sum = a+b+c+d+e;
	
	float average= Sum / 5;
	
	printf("The average of given 5 numbers is %f",average);
}