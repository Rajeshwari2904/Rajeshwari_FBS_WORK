// Assignment No.7

//6. Accept array and print only prime numbers of array. 

#include<stdio.h>

void main()
{
	int arr[6];
	
	printf("Enter elements of array: ");
	for(int i=0; i<6; i++)
	{
		scanf("%d", &arr[i]);
	}
	
    printf("Array: [");
	for(int i=0; i<6; i++)
		{
			printf("%d, ", arr[i]);
		}
	printf("]");
	
	printf("\nprime Numbers in Array: ");
	
	for(int i = 0; i < 6; i++)
    {
        int num = arr[i];
        int isprime = 1;

        if (num < 2)
            isprime = 0;

        for(int j = 2; j <= num / 2; j++)
        {
            if(num % j == 0)
            {
                isprime = 0;
                break;
            }
        }

        if(isprime)
        {
            printf("%d ", num);
        }
    }
	
}