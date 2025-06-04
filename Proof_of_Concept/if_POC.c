#include <stdio.h>
/*
void main()
{
	int a =10, b=20;
	
	if(a>b)       //The Scope of if is valid till next line of if 
	 printf("Hello"); 
	 printf("FBS");  //Output: FBS
}  */
/*
void main()
{
	int a =10, b=20;
	
	if(a>b) ;      
	 printf("Hello"); 
	 printf("FBS");   //HelloFBS
	
}  */

void main()
{
	int a =10, b=20;
	
	if(a>b)      
	 printf("Hello"); 
	 printf("FBS");        
	 
	else
	printf("Will it be print...?");  //it will gives else without if error.
}