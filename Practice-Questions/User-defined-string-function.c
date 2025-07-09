//User defined string function

#include<stdio.h>
#include<string.h>

char* strnchr(char*, char);

void main()
{
	char str[] = "Hello";
	char ch= 'e';
	
	char* res= strnchr(str, ch);
	printf("%p", res);
	
}

char* strnchr(char* ptr, char x)
{
	int i =0;
	while(ptr[i]!= '\0')
	{
		if(ptr[i]== x)
		{
			return &ptr[i];
		}
	 i++;
	}
	return NULL;
	
}