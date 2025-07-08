// Reverse a String

#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("Enter a String: ");
	gets(str);
	
	int size =0;
	int k=0;
	while(str[k] != '\0')
	{
		size++;
		k++;
	}
	for(int i=0, j=size-1; i<=j; i++, j--)
	{
		char temp = str[i];
		str[i]= str[j];
		str[j]= temp;
	}
	
	printf("\nReversed String is: ");
	puts(str);
	
}