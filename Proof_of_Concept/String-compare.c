#include<stdio.h>
#include<string.h>

void main()
{
	char str1[20];
	char str2[20];
	printf("Enter 2 Strings: ");
	scanf("%s\n", str1);
	scanf("%s", str2);
	
	int res= strcmp(str1, str2);
	
	if(res== 0)
	{
		printf("Strings are Same");
	}
	
	else if(res == 1)
	{
		printf("str1 %s is greater", str1);
	}
	else
	{
		printf("str2 %s is greater", str2);
	}
	
}


/*
#include<stdio.h>
#include<string.h>

void main()
{
	char str1[20];
	char str2[20];
	printf("Enter 2 Strings: ");
	scanf("%s\n", str1);
	scanf("%s", str2);
	
	int res= mystrcmp(str1, str2);
	
	if(res== 0)
	{
		printf("Strings are Same");
	}
	
	else if(res == 1)
	{
		printf("str1 %s is greater", str1);
	}
	else
	{
		printf("str2 %s is greater", str2);
	}
	
}

void mystrcmp(char* ptr1, char* ptr2)
{
	if(strlen(ptr1)!= strlen(ptr2))
	    return 1;
	    
	int i= 0;
	while(ptr1[i]!='\0')
	{
		if(ptr1[i]!= ptr2[i])
		     return 1;
		     
	  i++;
	}
	
	return 0;
}     */