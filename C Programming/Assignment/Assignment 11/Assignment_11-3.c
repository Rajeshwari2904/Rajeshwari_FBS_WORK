// 3. WAP to Remove the nth Index Character from a Non-Empty String

#include<stdio.h>
#include<string.h>

void main()
{
	char str[50];
	printf("Enter a String: ");
	gets(str);
	
	int index, count =0;
	printf("Enter a index number: ");
	scanf("%d", &index);
	
	
	for(int i =index; str[i] != '\0'; i++)
	{	
			str[i] = str[i+1];
			
	}
	
	printf("%s", str);
}