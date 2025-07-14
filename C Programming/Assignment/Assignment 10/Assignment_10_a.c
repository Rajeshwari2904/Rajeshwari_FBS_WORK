//Assignment No. 10
// User Defined function for mystrcpy

#include<stdio.h>
#include<string.h>

char* mystrcpy(char* , const char*);

void main()
{
	char dest[20];
	char src[]= "Akshara";
	mystrcpy(dest, src);
	
	printf("Copied String: %s", dest);
	
	
}

char* mystrcpy(char* dest, const char* src)
 {
    char* ptr = dest;
    while (*src)
        *ptr++ = *src++;
    *ptr = '\0';
    return dest;
}




