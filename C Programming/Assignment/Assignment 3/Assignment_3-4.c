/* 4 Check the given number is prime or not.
Input: n = 7
Output: Prime  */

#include <stdio.h>     //Using For Loop

void main()
{
	int no;
	int flag=0;
	
	printf("Enter a number: ");
	scanf("%d", &no);
	int temp =no;
	
	for(int i=2; i<=no/2; i++)
	{
		if(no % i==0 )
		{
			flag=1;
			break;
		}
	}
	
	if(flag==1)
	{

		printf("%d is not  Prime Number", temp);
	}
	else
	{
		printf("%d is  a Prime Number", temp);
	}
	
}


//Using While loop
void main()
{
	int no= 7, i=2;
	int flag = 0;
	
	while(i<=no/2)
	{
		if(no%i==0)
		{
			flag=1;
			break;
		}
	  i++;
	}
	
	if(flag==1)
	{
		printf("%d is not  Prime Number", no);
	}
	else
	{
		printf("%d is  a Prime Number", no);
	}
	
	
}