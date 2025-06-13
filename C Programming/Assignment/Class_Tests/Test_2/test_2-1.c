// test 2

// WAP to calculate electricity bill.

#include <stdio.h>

void main()
{
	int units, ele_bill;
	printf("Enter no of units: ");
	scanf("%d", &units);
	
	if(units>=1 && units<=50)
	{
		ele_bill= 30 * units;
		printf("30 rs/unit You have to pay total 30 * %d\n",units);
		printf("Electricity bill: %d", ele_bill);
	}
	
	else if(units>=51 && units<150)
	{
		ele_bill= 40 * units;
		printf("40 rs/unit You have to pay total 40 * %d\n",units);
		printf("Electricity bill: %d", ele_bill);
	}
	else if(units>=151)
	{
		ele_bill= 50 * units;
		printf("50 rs/unit You have to pay total 50 * %d\n",units);
		printf("Electricity bill: %d", ele_bill);
	}
	else
	{
		printf("invalid units...");
	}
}