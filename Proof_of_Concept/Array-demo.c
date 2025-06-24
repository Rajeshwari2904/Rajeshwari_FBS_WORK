#include<stdio.h>

void main()
{
	int arr[5];
	for(int i=0; i<5; i++){
		printf("Enter element %d: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	printf("[");
	for(int i =0; i<5; i++)
	  printf("%d ,", arr[i]);
	printf("\b]\n"); //\b for extra comma
	
//	int Sum=0;
//	for(int i=0; i<5; i++)
//	Sum= Sum + arr[i];
//	printf("Sum= %d", Sum);

   int brr[4];
	for(int i=0; i<4; i++){
		printf("Enter element %d: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	printf("[");
	for(int i =0; i<4; i++)
	  printf("%d ,", arr[i]);
	printf("\b]\n");
	
	
	int crr[6];
	for(int i=0; i<6; i++){
		printf("Enter element %d: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	printf("[");
	for(int i =0; i<6; i++)
	  printf("%d ,", arr[i]);
	printf("\b]");
}