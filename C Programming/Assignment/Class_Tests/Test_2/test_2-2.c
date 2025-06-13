// test 2

#include <stdio.h>

void main()
{
	int no;
	printf("Enter a Number: ");
	scanf("%d", &no);
	
	if(no>0)
	{
		printf("%d is Positive", no);
	}
	
	else if(no==0)
	{
		printf("Number is Neutral");
	}
	else
	{
		printf("%d is Negative", no);
	}
}