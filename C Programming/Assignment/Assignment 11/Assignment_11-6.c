// 6. WAP to Take in a String and Replace Every Blank Space with special symbol.

#include<stdio.h>
#include<string.h>

void main()
{
	char str[50];
	printf("Enter a String: ");
	gets(str);
	
	char symbol = '@';
	
	for(int i=0; str[i] != '\0'; i++)
	{
		if(str[i]==' ')
		{
			str[i]= symbol;
		}
	}
	
	printf("The Updated String is: %s", str);
}