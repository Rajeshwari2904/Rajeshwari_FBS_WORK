#include <stdio.h>
#include <string.h>
#include <ctype.h>

void main() {
    char str1[50] = "Hello";
    char str2[50] = "World";
    char str3[50];
    char str4[50] = "HELLO";

    // 1. strcpy - Copy string
    strcpy(str3, str1);
    printf("1. strcpy: %s\n", str3);

    // 2. strcat - Concatenate strings
    strcat(str1, str2);
    printf("2. strcat: %s\n", str1);

    // 3. strlen - String length
    printf("3. strlen: %zu\n", strlen(str1));

    // 4. strcmp - Compare strings
    printf("4. strcmp: %d\n", strcmp(str1, str2));

    // 5. strncmp - Compare first n characters
    printf("5. strncmp: %d\n", strncmp(str1, str2, 3));
    
}