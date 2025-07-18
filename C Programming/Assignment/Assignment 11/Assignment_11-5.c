// 5. WAP to Count the Number of Vowels in a String

#include<stdio.h>
#include<string.h>

void main()
{
	char str[40];
	printf("Enter a String: ");
	gets(str);
	
	int count=0;
	
	for(int i=0; str[i] !='\0'; i++)
	{
		char ch = str[i];
		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch =='o' ||ch =='u' || ch =='A' || ch =='E' || ch =='I' ||ch =='O' || ch == 'U')
		{
			count++;
		}
	}	
	printf("The total number of Vowels are %d", count);
}