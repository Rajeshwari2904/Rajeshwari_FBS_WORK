/* 3. Print perfect numbers in the given range 1 to n  */

#include <stdio.h>
void main()
{
	
	for(int i=1; i<=1000; i++)
	{
		int sum=0, no=i;
		for(int j=1; j<no; j++ )
		{
			if(no % j==0)
			{
				sum= sum + j;
			}
		}
		
		if( no == sum)
		{
			printf("%d\n", no);
		}
	}
}