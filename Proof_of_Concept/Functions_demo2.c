// Assignment 1 Using Functions

//2.Write a program to check given 3 digit number is pallindrome or not



#include<stdio.h>

void Palindrome();     // Function Declaration

void main()
{

   Palindrome();     // Function Call
	
}


void Palindrome(){       // Function Definition
	int no = 123;
	int a, x1, b, c;
	
	a = no % 10; //1
	x1 = no / 10; //12
	
	b = x1 % 10; // 2
	c = x1 / 10; // 1
	
	int reverse_no = a*100+b*10+c;
	
	if( no == reverse_no)
	{
		printf("The Number is Palindrom");
	}
	else
	{
		printf("The Number is not Palindrom");
	}
	
}
