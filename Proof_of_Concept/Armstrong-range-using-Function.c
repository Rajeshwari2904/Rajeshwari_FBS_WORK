//Using Functions type 4...with parameters and returnType

// 1. Print armstrong numbers in the given range 1 to n.

#include <stdio.h>

void armstrongInRange(int, int);
int isArmstrong(int);
int countno(int);

void main()
{
	armstrongInRange(1, 155);
	
}
int countno(int no)
{
	int count=0;
		while(no > 0)
		{
			count++;
			no =no/10;
		}
		
		return count;
}

int isArmstrong(int num)
{
		int no=num, rem, res, sum=0;
		int temp=num;
		int count = countno(num);
	
		while(no>0)
		{
			rem=no%10;
			int res=1;
			 for(int i=1; i<=countno(num); i++)
			{
				res=res* rem;
			}
		
			sum=sum+res;
			no = no/10;
		}
		return sum==temp;
}

void armstrongInRange( int start, int end)
{
	for(int j=start; j<=end; j++)
	{
		int num;
		int res = isArmstrong(j);

		if (res==1)
		{
			printf("%d is Armstrong\n", j);
		}
			
	}
}