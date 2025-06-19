//Test 3

//1. WAP Print even and odd numbers in a given range

#include<stdio.h>

void main()
{
	//int start= 10, end=25;
	
	for(int i=1; i<=15; i++ )
	{
		if(i%2==0)
			printf("%d ", i);
	}
	printf("\n");
	for(int i=10; i<=25; i++ )
	{
		if(i%2!=0)
			printf("%d ", i);
	}
}