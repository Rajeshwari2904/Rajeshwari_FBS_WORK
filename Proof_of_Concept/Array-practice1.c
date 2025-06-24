#include<stdio.h>

void storeArray(int*, int);
void displayArray(int*, int);

void main()
{
	int arr[10];
	storeArray(arr, 10);
	displayArray(arr, 10);
	replace(arr, 10, 7,5);
	printf("\nAfter replacing: ");
	display(arr,10);
}

void storeArray(int *ptr, int size)
{
	printf("Enter elements of arr: ");
	for(int i=0; i<size; i++)
	{
		scanf("%d", &ptr[i]);
	}
}

void displayArray(int *ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		printf("%d ,", ptr[i]);
	}
}

int replace(int *ptr, int size, int old_element, int new_element)
{
	int status=0;
	for(int i=0; i<size; i++)
	{
		if(old_element==ptr[i])
		{
			ptr[i]= new_element;
			status =1;
		}
		
	}
	
	return status;
	
}

void display(int *ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		printf("%d ,", ptr[i]);
	}
}
