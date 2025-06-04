// 4. Write a program to check whether a given character is a vowel or consonant.

#include <stdio.h>

void main()
{
	char ch = 'z';
	
	if( ( ch=='a'||ch=='e' ||ch=='i'|| ch=='o'||ch=='u' ) ||
	     (ch=='A'||ch=='E'|| ch=='O'||ch=='o'||ch=='U') )
	{
		printf("%c is a vowel",ch);
	}
	else
	{
		printf("%c is a Consonant", ch);
	}
}