//6. Write a C program to find the square and cube of a given number.

#include<stdio.h>

void main()
{
	int x = 15;
	
	int Square = x * x;
	int Cube = Square * x;
	
	printf("Square of %d is : %d \nCube of %d is : %d",x,Square, x, Cube);
}