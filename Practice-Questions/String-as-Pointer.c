#include<stdio.h>
#include<string.h>

void main()
{
	char str[]= "Rajeshwari Nalbalwar";
	
	char *ptr= str;
	int i=0;
	while(*ptr!='\0')
	{
		printf("%c", *ptr);
		ptr++;
		i++;
	}
}