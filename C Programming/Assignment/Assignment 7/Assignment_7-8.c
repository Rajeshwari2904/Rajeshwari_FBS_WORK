// Assignment No.7

// 8. Merge two arrays

#include<stdio.h>

void main()
{
	int arr[5]= {1, 2, 3, 4, 5};
	int brr[3]= {6, 7, 8};

	int crr[8];
	
	for(int i=0; i<5; i++)
	{
		crr[i]= arr[i];  // copy elements of arr into crr
	}
	
	for(int i=0; i<3; i++)
	{
		crr[5 + i ]= brr[i];  // copy elements of brr into crr from index 5
	}
	
	printf("Merged Array:[ ");
	for(int i=0; i<8; i++)
	{
		printf("%d, ", crr[i]);  //  print merged array crr
	}
	printf("\b]");
	
}