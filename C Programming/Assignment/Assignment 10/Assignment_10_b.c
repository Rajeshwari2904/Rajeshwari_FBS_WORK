//Assignment No. 10
// User Defined function for mystrcpy

#include<stdio.h>
#include<string.h>

int mystrlen(char*);

void main()
{
	char str[] = "Shri Swami Samarth";
	
	int result = mystrlen(str);
	
	printf("Length of String is: %d", result);
}

int mystrlen(char* str)
{
	int count=0;
	
	while(*str!= '\0')
	{
		count++;
		str++;
	}
	
	return count;
}