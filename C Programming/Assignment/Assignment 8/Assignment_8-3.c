//Assignment no.7 Using Functions

//3. Find sum of all numbers. 

#include<stdio.h>

void SumOfArray(int arr[]);    // Function Declaration

void main()
{
	int arr[5];
	printf("Enter 5 array elements: ");
	
	for(int i=0; i<5; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	printf("[");
	for(int i=0; i<5; i++)
	{
		printf("%d ,", arr[i]);
	}
	printf("\b]");
	
	SumOfArray(arr);    // Function Call
}

void SumOfArray(int arr[])     // Function Definition
{
	int sum=0;
    for(int i=0; i<5; i++)
	 {
	 	sum =sum + arr[i];
   	 }
	
	 printf("\nSum of all Array elements= %d", sum);
}