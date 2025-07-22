// 7. WAP to Remove the Characters of Odd Index Values in a String

#include<stdio.h>
#include<string.h>

void main()
{
	char str[100], str1[100];
	int j =0;
	printf("Enter a String: ");
	gets(str);
	
	for(int i=0; str[i] != '\0'; i++)
	{
		if(i %2 ==0)
		{
			str1[j++]= str[i];
		}
	}
	
	printf("After removing the Odd index Characters The String is %s", str1);
}