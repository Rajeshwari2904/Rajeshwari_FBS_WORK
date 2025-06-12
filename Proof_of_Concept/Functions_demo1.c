// Assignment 1 Using Functions

//1. Write a program to check whether a number is even or odd.

#include<stdio.h>

void evenOdd();   // Function Declaration

void main()
{
	
	evenOdd();  // Function Call
	
}
 
 
void evenOdd(){              // Function Definition
	int number = 9;
 	if( number % 2== 0)
	{
		printf("Even");
	}
	else
	{
		printf("Odd");
	}
 }
