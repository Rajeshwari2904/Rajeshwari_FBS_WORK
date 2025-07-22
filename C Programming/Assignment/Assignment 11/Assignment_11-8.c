//8. WAP to Calculate the Number of Words Present in a String

#include<stdio.h>
#include<string.h>

void main()
{
	char str[50];
	printf("Enter a String:");
    gets(str);
    int count =0;
	
	for(int i=0; str[i]!= '\0'; i++)
	{
		
		if(str[i] == ' ')
		{
			count++;
		}
	}
	
	printf("The total number of words in string are %d", count+1);
	
}
