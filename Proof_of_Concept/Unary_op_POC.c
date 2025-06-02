// Unary Operators

#include<stdio.h>

void main()
{
	int a = 10;
	++a;
	printf("a=%d\n", a);
	
	int x = 15;
	int y = ++x; // Prefix Increment
	printf("Y = %d\n",y); // 16
	
	int p = 20;
	int q = p++; // Postfix Increment
	printf("q = %d\n",q); // 20
	
	//Decrement Oprerator
	
	int s = 25;
	int r = 30;
	printf("s = %d\n", --s);  //Pre-decrement 
	printf("r = %d", r--);    // Post-decrement
	
}