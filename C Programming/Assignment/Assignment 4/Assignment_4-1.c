// 1. Print armstrong numbers in the given range 1 to n.

#include <stdio.h>

void main()
{
	for(int j=1; j<=1000; j++)
	{
		int no=j, rem, res, sum=0;
		
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
		{
			printf("%d is Armstrong\n", temp);
		}
	
	}
	
}