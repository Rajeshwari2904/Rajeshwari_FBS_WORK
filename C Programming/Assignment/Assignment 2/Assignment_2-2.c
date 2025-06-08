//2. Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.


#include <stdio.h>

void main()
{
	int s1,s2,s3;
	printf("Enter sides: ");
	scanf("%d\n",&s1);
	scanf("%d\n",&s2);
	scanf("%d",&s3);
	
	if(s1 == s2 && s2 == s3)
	{
		printf("equilateral triangle");
	}
	
	else if( s1 == s2 || s2 == s3 || s1 == s3)
	{
		printf("isosceles triangle");
	}
	
	else
	{
		printf("scalene triangle");
	}
	
}