/*7. Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
respectively. */

#include <stdio.h>

void main()
{
	int basic, total_salary;
	float da, ta, hra;
	
	basic = 6000;
	
	if(basic<=5000)
	{
		da = basic * 0.10;  // 10/100 both are integer thats why its gives 0.
		ta = basic * (20.0/100);
		hra = basic * (25.0/100);
		
	}
	else
	{
		da = basic * (15.0/100);
		ta = basic * (0.25);
		hra = basic * 0.30;
	}
	
	total_salary = basic + da + ta + hra;
	
	printf("%.2f\n",da);
	printf("%.2f\n",ta);
	printf("%.2f\n",hra);
	printf("Total Salary = %d", total_salary);
}