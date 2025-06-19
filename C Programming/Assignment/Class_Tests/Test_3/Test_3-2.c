//Test 3

/*2.WAP to add alternate numbers from given range
  eg. start= 1  end = 5
      sum =9  */

#include<stdio.h>

void main()
{
	int sum=0;
	
	for(int i=1; i<=5; i+=2)
	{
		printf("%d ", i);
		sum= sum + i;
	}
	
	printf("\nSum= %d", sum);
}