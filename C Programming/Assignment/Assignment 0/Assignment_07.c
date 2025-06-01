//7. Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>

void main()
{
	int minutes = 525;
	
	int hours = minutes / 60;
	
	int New_minutes = minutes % 60;
	
	printf("Ater converting %d minutes into hours are %d hr:%d min.",minutes, hours, New_minutes );
}