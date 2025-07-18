/* Write a program to scan string from user then scan a single character and search it in a accepted string.  */

#include<stdio.h>
#include<string.h>

void main()
{
	char str[50];
	printf("Enter a String: ");
	gets(str);
	
	char ch;
	puts("Enter a character: ");
	scanf("%c", &ch);
	
	for(int i=0; str[i] != '\0'; i++)
	{
		if(str[i] == ch)
		{
			printf("index of that character is : %d", i);
		}
	}
}