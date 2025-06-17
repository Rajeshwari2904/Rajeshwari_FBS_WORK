//class work for logic building 

#include<stdio.h>
#include<math.h>

int sumofpos(int, int);

void main()
{
	int num = 123456, pos=3;  // change the position
	int res = sumofpos(num, pos);
	if(res!= 0)
		printf("%d", res);
}

int getcount(int num)
{
	int count =0;
	while(num > 0)
	{
		count++;
		num =num/10;
	}
	return count;
}

int sumofpos(int num, int pos)
{
	int count= getcount(num);
	if(count/ pos < 2)
	{
		printf("Groups cannot be formed no output");
		return 0;
	}
	int firstdigit, lastdigit;
	int x= pow(10, pos);
	
	lastdigit= num % x;   //5
	while(num > x)
	{
		num = num /10;
	}
	return lastdigit+num;	
}

