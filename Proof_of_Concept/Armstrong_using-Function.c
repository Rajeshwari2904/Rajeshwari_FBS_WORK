//Using Functions

/*  5 Check the given number is Armstrong number or not..
Input: n = 153
Output: Armstrong  */

#include <stdio.h>

int isArmstrong(int);

void main()
{
	int no;
	printf("Enter a Number: ");
	scanf("%d", &no);
	
//	isArmstrong(no);
	if(isArmstrong(no)==1)
	{
		printf("Armstrong Number");
	}
	else
	{
		printf("Not a Armstrong Number");
	}
}

int isArmstrong(int no)
{
	int rem,res,sum=0;
	int temp=no;
	
	int count=0;
	while(no > 0)
	{
		count++;
		no =no/10;
	}
	
	no= temp;
	
	while(no>0)
	{
		rem=no%10;
		int res=1;
		for(int i=1; i<=count; i++)
		{
			res=res* rem;
		}
		
		sum=sum+res;
		no = no/10;
	}
	
	if(sum==temp)
		return 1;
	else
		return 0;
	
}