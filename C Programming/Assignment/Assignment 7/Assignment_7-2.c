//Assignment no.7

//2. Search the given number in array

#include<stdio.h>

void main()
{
	int arr[6];
	printf("Enter Array Elements: ");

    for(int i=0; i<6; i++)
    {
    	scanf("%d", &arr[i]);
    	
	}
	
	printf("[");
	for(int i=0; i<6; i++)
    {
    	printf("%d ,", arr[i]);
    	
	}
	printf("\b]");
	
	int num;
	printf("\nEnter a Number: ");
	scanf("%d", &num);
	int flag=0;
	
	for(int i=0; i<6; i++)
	{
		if(arr[i]==num)
		{
			flag = 1;
			break;
		}
		
	}
	
	if(flag==1)
	 printf("Number is found.");
	 
	else
	{
		printf("Number not found.");
	}
	
}





