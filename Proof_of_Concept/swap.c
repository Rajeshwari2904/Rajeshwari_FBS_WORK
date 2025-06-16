// Pointer

#include <stdio.h>

void swap(int*,int*);

void main()
{
	int no1 =10, no2 = 20;
	printf("Before swap no1= %d, no2=%d\n",no1,no2);
	
	swap(&no1, &no2);
	printf("After swap no1= %d, no2=%d",no1,no2);
}

void swap(int* no1, int* no2)
{
	int x= *no1;
	*no1= *no2;
	*no2=x;
}

//void main()
//{
//	int a = 10, b= 20;
//	int *p =&a;
//	int c = *p;
//	int *x =&b;
//	    *x =30;
//	      p=x;
//	   *p = 40;
//	 
//    printf(a,b,c,p,x,*p,*x);
//}