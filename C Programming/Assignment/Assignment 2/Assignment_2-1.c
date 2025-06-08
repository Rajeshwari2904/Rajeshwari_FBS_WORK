/*  1. Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
desired operations.  */

#include<stdio.h>

void main()
{
	int no1,no2, result;
	printf("Enter Number 1: ");
	scanf("%d", &no1);
	printf("Enter Number 2: ");
	scanf("%d", &no2);
	
	char op;
	printf("Enter Operator (+,-,/,*,%): ");
	scanf(" %c", &op);
	
	if( op == '+' )
	{
		result = no1 + no2;
		
	}
	
	
	else if ( op == '-' )
	{
		result = no1 - no2;
		
	}
			
	else if ( op == '*' )
	{
		result = no1 * no2;
	}
		
	
	else if ( op == '/' )
	{
		result = no1 / no2;
	}
		
	
	else if ( op == '%' )
	{
		result = no1 % no2;
	}
		
		
	else
	{
		 printf("invalid operator");
	}
	  
		
	printf("%d %c %d = %d", no1,op,no2, result);
	
	
}
