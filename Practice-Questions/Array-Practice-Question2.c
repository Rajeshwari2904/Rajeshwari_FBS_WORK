//Find the total number of triplets in the array whose sum is equal to the given value x

#include<stdio.h>

void main()
{
	int arr[8] = {1,2 ,3,4,5,6,7,8};
	int x, totaltriplets=0;
	scanf("%d", &x);
	printf("\n%d", x);
	
	for(int i=0; i<=7; i++)
	{
		 for(int j=i+1; j<=7; j++)
		 {
		 	for(int k=j+1; k<=7; k++)
		 	{
		 		if(arr[i] + arr[j] + arr[k] == x)
		 	{
		 		totalpairs++;
		 		printf("\n(%d, %d, %d)", arr[i], arr[j], arr[k]);
			 }
			 }
		 	
		 }
	}
	
	printf("\n%d", totaltriplets);
}