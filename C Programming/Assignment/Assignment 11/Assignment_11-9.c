// 9. WAP to Take in Two Strings and Display the Larger String without Using Built-in Functions

#include<stdio.h>

void main()
{
	char str1[50], str2[100];
	printf("Enter string 1: ");
	gets(str1);
	printf("Enter string 2: ");
	gets(str2);
	
	int str1_len =0, str2_len=0;
	
	for(int i=0; str1[i]!='\0'; i++)
	{
		str1_len++;
	}
	
//	printf("%d\n", str1_len);
	
	for(int i=0; str2[i]!='\0'; i++)
	{
		str2_len++;
	}
//	printf("%d", str2_len);

   if(str1_len > str2_len)
   {
   	printf("%s is larger", str1);
   }
   else if(str1_len < str2_len)
   {
   	printf("%s is larger", str2);
   }
   else
   {
   	printf("Both Strings are equal");
   }
	
}