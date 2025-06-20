//Assignment no.7

//3. Find sum of all numbers. 

#include<stdio.h>

void main()
{
	int arr[5], sum=0;
	printf("Enter 5 array elements: ");
	
	for(int i=0; i<5; i++)
	{
		scanf("%d", &arr[i]);
	}
	for(int i=0; i<5; i++)
	{
		printf("%d ,", arr[i]);
	}
	
	for(int i=0; i<5; i++)
	{
		sum =sum + arr[i];
	}
	
	printf("\nSum of all Array elements= %d", sum);
}