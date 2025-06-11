/*  5 Check the given number is Armstrong number or not..
Input: n = 153
Output: Armstrong  */

#include <stdio.h>

void main()
{
	
	int no,rem,res,sum=0;
	printf("Enter a Number: ");
	scanf("%d", &no);
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
		int res=1, i =1;
		while(i<=count)
		{
			res=res* rem;
			i++;
		}
		
		sum=sum+res;
		no = no/10;
	}
	
	if(sum==temp)
	{
		printf("Number is Armstrong");
	}
	else
	{
		printf("Number is Not Armstrong");
	}
}