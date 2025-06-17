/* 2. Print prime numbers in the given range 1 to n.  */

//Using Functions Type 4......with parameter and returnType

#include <stdio.h>

int primeRange(int, int);

void main()
{
	primeRange(1, 1000);
}

int primeRange(int start, int end)
{
	for(int i=start; i<=end; i++)
	{
		int no=i;
	    int flag=0;
	    int temp =no;
	
	   for(int j=2; j<=no/2; j++)
	   {
	    	if(no % j==0 )
	      	{
				flag=1;
				break;
			}
    	}
	
		if(flag==0)
			printf("%d\n", temp);	
	}
}
