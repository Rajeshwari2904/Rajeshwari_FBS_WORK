// Assignment 11

// 10. Write a program to check the string is palindrome or not.

#include<stdio.h>
#include <string.h>

void main() 
{
    char str[50] , reversed[50] ;
    printf("Enter a string : ");
	scanf("%s", &str);
    int len = strlen(str);  
	
	for(int i=0; i<len; i++)
	{
	    reversed[i] = str[len-1-i];
	}
	
	reversed[len] = '\0';
    
	printf("Reversed String is %s\n", reversed);
 
    if (strcmp(str, reversed) == 0) 
	{
        printf("The string is a palindrome.\n");
    } 
	else {
        printf("The string is not a palindrome.\n");
    }
}