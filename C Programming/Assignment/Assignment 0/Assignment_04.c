//4. Write a C program to swap two numbers using a temporary third variable

#include<stdio.h>
void main()
{
	int a = 5, b= 10;
	
	int c = a;
	a = b;
	b = c;
	 
	printf("After swapping a=%d, b= %d",a,c); //a= 10, b=5.
}