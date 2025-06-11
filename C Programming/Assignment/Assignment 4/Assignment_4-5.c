/* 5. Write a menu driven program to take a number for user and perform operations as follows.
Press 1.To check number is even or odd.
 2.To check number is prime or not.
 3.To check number is pallindrome or not.
 4.To check number is positive, negative or zero.
 5.To reverse a number.
 6.To find sum of digits.   */
 
#include <stdio.h>
 
void main()
{
	int no, choice;
	printf("Enter a Number: ");
	scanf("%d" , &no);
	
	printf("Press 1.To check number is even or odd.\n	2.To check number is prime or not.\n	3.To check number is pallindrome or not.\n	4.To check number is positive, negative or zero.\n	5.To reverse a number.\n	6.To find sum of digits.");
	
	printf("\nEnter your choice: ");
	scanf("%d", &choice);
	if(choice==1)
	{
		if(no%2==0)
		{
			printf("%d is Even", no);
		}
		else
		{
			printf("%d is Odd", no);
		}
	}
	
	else if(choice==2)
	{
		int flag=0;
		int temp=no;
		for(int i=2; i<=no/2; i++)
		{
			if(no%i==0)
			{
				flag=1;
			    break;
			}		  
		}
		if(flag==0)
		  printf("%d is Prime",temp);
		else
		  printf("%d is Not Prime",temp);
	}
	
	else if(choice==3)
	{
		int temp=no, rem, rev;
		
		while(no>0)
		{
			rem = no % 10;
			rev= rev * 10 + rem;
			no= no /10;
		}
		
		if(temp== rev)
		{
			printf("%d is a Palindrome.", temp);
		}
		else
		{
			printf("%d is not Palindrome.", temp);
		}
	}
	
	else if(choice==4)
	{
		if(no>0)
		{
			printf("%d is Positive",no);
		}
		else if(no<0)
		{
			printf("%d is Negative",no);		
		}
		else
		{
		    printf("The Number is Zero");
		}
	}
	
	else if(choice==5)
	{
		int temp=no, rev, rem;
		
		while(no > 0)
		{
			rem= no % 10;
			rev= rev * 10 + rem;
			no = no/10;
		}
		printf("%d is reversed number of %d", rev,temp);
	}
	
	else if(choice==6)
	{
		int sum=0,rem, temp=no;
		
		while(no > 0)
		{
			rem = no % 10;
			sum = sum + rem;
			no =no/10;
		}
		
		printf("%d is Sum of %d",sum,temp);
	}
	
	else
	{
		printf("please enter valid choice...");
	}
	
}