// Test 1
 
//Convert the time entered in hh,min and sec into total Seconds.

#include <stdio.h>

void main()
{
	int hr, min, sec, total_sec;
	printf("Enter Time in hr:min:sec-->");
	scanf("%d:%d:%d",&hr,&min,&sec);
	
	int New_sec = hr * 60 * 60 + 24 * 60 + sec;
	
   // total_sec = hr_sec + min_sec + sec;
    printf("Total Seconds : %d",New_sec);
		
}  






