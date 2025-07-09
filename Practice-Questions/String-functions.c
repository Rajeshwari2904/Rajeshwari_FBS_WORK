#include<stdio.h>
#include<string.h>

char * mystrcpy(char*, char*);

void main()
{
	char str1[]= "Rajeshwari";
	char str2[15];
	
	char* copiedstring= mystrcpy(str2, str1);
	
	printf("%p", copiedstring);  //%s
		
}

char* mystrcpy(char* ptr1, char* ptr2)
{
	int i= 0;
	while(ptr2[i]!= '\0')
	{
		ptr1[i]= ptr2[i];
		i++;
	}
	
	ptr1[i]='\0';
	return ptr1;
}