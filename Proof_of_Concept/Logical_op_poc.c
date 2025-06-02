//Logical Operators Proof of Concenpts

#include<stdio.h>

void main()
{
	int x = 10 && -20;
	
	printf("%d\n", x);  //Logical operators return integer value 1 or 0.
	
	int y = 10>20<30 && 40<50+20;  // Arithmatic > Relational > Logical
	printf("%d\n", x);
	
	int Z = printf("Firstbit") || printf("Solutions");  //once you get T in OR|| operation no need to check further
	printf("%d", Z); // Output: Firstbit1
	
	int c = 10 + printf("\nHello") > printf("_FBS") && printf("_abc")+ printf("_PQR") || printf("Solutions");
	printf("%d", c); // Output: Hello_FBS_abc_PQR1
	
	int q = 20-printf("\ngreata") + 2 > printf("_skr") || 3+ printf("Hello") && printf("Solutions"); // OR operator takes final decision.
	printf("%d", q);  // Output: greata_skr1
	 
	int p = 10 + printf("\nF_bs") > 16 && printf("Hello__1") && 50 < 20 + 60 || printf(" Solutions");
	printf("%d",p); // Output: F_bs Solutions1
	// Once you get one false 0 in AND && operation then skip further part of AND operator. 
	
	
	
}