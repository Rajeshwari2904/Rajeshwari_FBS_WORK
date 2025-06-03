//2.Write a program to check given 3 digit number is pallindrome or not
//Palindrome ( a number that remains the same when its digits are reversed)


#include<stdio.h>

void main()
{
	int no = 121;
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
	
	//printf("%d", reverse);
}