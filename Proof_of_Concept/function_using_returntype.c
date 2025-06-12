

#include <stdio.h>

int add();

void main()
{
	
    int res=add();
    printf("%d",res);
	
}

int add()
{
	int no1, no2, result;
	printf("Enter 2 Numbers: ");
	scanf("%d %d", &no1,&no2);
	result = no1 + no2;
	
	return result;
}