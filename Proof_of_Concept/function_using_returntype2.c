

#include<stdio.h>

float average();

void main()
{
	
	float avg= average();
	printf("%.2f", avg);
}

float average()
{
	float a=11, b=22, c=25.5, d=30, e=15;
	
	float Sum = a+b+c+d+e;
	
	float average= Sum / 5;
	
	return average;
}