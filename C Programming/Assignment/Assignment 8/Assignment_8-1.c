// Assignment no.7 Using Functions

//1. Find minimum and maximum number in array. 

#include<stdio.h>

int maximum( int arr[]);      // Function Declaration
int minimum(int arr[]);       // Function Declaration

void main()
{
	int arr[5]= {1, 9, 3, 4, 5 };   
	 
	int max = maximum(arr);                    // Function Call
	printf("maximum Number: %d\n", max);
	
	int min = minimum(arr);                    // Function Call
	printf("minimum Number: %d", min);
	
}

int maximum( int arr[])                   // Function Definition
{
	int max= arr[0];
	for (int i=0; i<5; i++)
	{
		if(arr[i]>max)
		{
			max= arr[i];
		}	
	}
	return max;
}

int minimum(int arr[])                    // Function Definition
{
	int min= arr[0];
	for (int i=0; i<5; i++)
	{
		if(arr[i]<min)
		{
			min= arr[i];
		}		
	}
	return min;
}
