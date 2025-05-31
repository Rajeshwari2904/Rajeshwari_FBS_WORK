//2. Write a program to calculate the percentage of student based on marks of
//   any 5 subjects.

#include <stdio.h>
void main()
{
	int science = 80, math = 90, history = 70, geo =75, hindi = 80;
	int Sum, percentage;
	
	Sum = science +math +history +geo +hindi;
	
	printf("The total no. of marks are %d ",Sum);
	
	percentage = Sum /5;
	
	printf("\nPercentages = %d% ",percentage);
	
	
	
}
     
     