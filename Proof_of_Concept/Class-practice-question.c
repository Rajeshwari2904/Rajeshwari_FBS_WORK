//class work for logic building

#include<stdio.h>
#include<math.h>

int sumofpos(int, int);

void main()
{
	int num = 12345, pos=1;  // change the position
	int res = sumofpos(num, pos);
	printf("%d", res);
}

int sumofpos(int num, int pos)
{
	int firstdigit, lastdigit;
	int x= pow(10, pos);
	
	lastdigit= num % x;   //5
	while(num > x)
	{
		num = num /10;
	}
	return lastdigit+num;	
}