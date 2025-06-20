//Assignment no.7

//1. Find minimum and maximum number in array. 

#include<stdio.h>

void main()
{
	//int arr[5];    // Declaration
	int arr[5]= {1, 9, 3, 4, 5 };   // Array initialization
	
	int max= arr[0];
	for (int i=0; i<5; i++)
	{
		if(arr[i]>max)
		{
			max= arr[i];
		}
		
	}
	printf("maximum Number: %d\n", max);
	
	int min= arr[0];
	for (int i=0; i<5; i++)
	{
		if(arr[i]<min)
		{
			min= arr[i];
		}
		
	}
	printf("minimum Number: %d", min);
	
	
	
	
}