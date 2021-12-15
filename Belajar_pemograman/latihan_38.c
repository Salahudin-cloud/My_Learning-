#include<stdio.h>

int  main() {
int  a, b , c , c_1 , c_2 , c_3  ;
float c_4 ;
puts("==================================");
puts("PROGRAM MENGHTIUNG : ");
puts("==================================");
printf("masukan a : ");
scanf("%i", &a);
printf("masukan  b : ");
scanf("%i", &b);
c = a % b ;
c_1 =  a + b ;
c_2 = a - b ;
c_3 = a * b ;
c_4 = a / b ;
printf("hasil c  = a mod b =  %i\n", c );
printf("hasil c  = a + b =  %i\n", c_1 );
printf("hasil c  = a - b =  %i\n", c_2 );
printf("hasil c  = a * b =  %i\n", c_3 );
printf("hasil c  = a / b =  %0.1f\n", c_4  );
puts("===================================");
return 0 ;
}

