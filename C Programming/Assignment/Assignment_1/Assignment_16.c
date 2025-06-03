//6. Write a program to check whether a given character is uppercase or lowercase.

#include <stdio.h>

void main()
{
	char ch = 'x';
	
    if( ch>='A' && ch<='Z')
    {
    	printf("Uppercase");
	}
	else
	{
		printf("Lowercase");
	}
	
}