//8. Write a C program to input the length and width of a rectangle and find its perimeter.

#include<stdio.h>

void main()
{
	int length = 15, width = 10;
	
	int Perimeter = 2 * (length + width);
	
	printf("Perimeter of Rectangle is %d", Perimeter);
}