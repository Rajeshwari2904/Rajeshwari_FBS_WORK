// 2. WAP Replace all Occurrences of ‘a’ with $ in a String

#include<stdio.h>
#include<string.h>

void main()
{
	char str[40];
	printf("Enter a String: ");
	gets(str);
	char ;
	
	for(int i=0; str[i] != '\0'; i++)
	{
		if(str[i] == 'a')
		{
			str[i] = '$';
		}
	}
	
	printf("Updated String %s", str);
	
}
