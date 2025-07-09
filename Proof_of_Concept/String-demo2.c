#include<stdio.h>
#include<string.h>

void main()
{
	char str[]= "aabbaa";
	char org[10];
	
	strcpy(org, str);
	
	printf("%s", strrev(str));
	
	if(strcmp(str, org)==0)
	{
		printf("\nPalindrome");
	}
	else
	{
		printf("\nNot palindrome");
	}
}