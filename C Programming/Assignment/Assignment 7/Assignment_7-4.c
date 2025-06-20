//Assignment no.7

//4. Find odd and even among the numbers. 

#include<stdio.h>

void main()
{
	int arr[6];
	
	for(int i=0; i<6; i++)
	{
		printf("Enter element %d: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	for(int i=0; i<6; i++)
	{
		printf("%d, ", arr[i]);
	}
	
	for(int i=0; i<6; i++)
	{
	   if(arr[i] % 2==0)
	   		printf("\n%d is even", arr[i]);
	   else
	   		printf("\n%d is Odd", arr[i]);
	   	
	}
	
}