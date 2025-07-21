//Assignment no.7 Using Functions

//5. Print alternate elements in array.

#include<stdio.h>

void alternateElement( int arr[]);           // Function Declaration
void main()
{
	int arr[6];
	printf("Enter Array elements(6): ");
	
	for(int i=0; i<6; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	printf("[");
	for(int i=0; i<6; i++)
	{
		printf("%d, ", arr[i]);	
	}
	printf("\b]");
	
	alternateElement(arr);              // Function Call
	
}

void alternateElement( int arr[])         // Function Definition
{
	printf("\nAlternate elements in array: \n");
	for(int i=0; i<6; i+=2)
	{
		printf("%d, ", arr[i]);
	}
}