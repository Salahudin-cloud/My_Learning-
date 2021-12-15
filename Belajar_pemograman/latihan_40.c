#include<stdio.h>

void main () {
// menggunakan "== "
//int a;
//a = "kau" == "uka";
//printf("a : %i",a) ;
//menggunakan " != "
//int a ;
//a = 5 != 7 ;
//printf("a : %i", a);
int a , b , c_1, c_2, c_3 , c_4, c_5 , c_6  ;
a = 5 ;
b = 5 ;
c_1 = a  ==  b ;
c_2 = a  <=  b ;
c_3 = a  >=  b ;
c_4 = a  !=  b ;
c_5 = a  >  b ;
c_6 = a  <  b ;
printf("a : %i\n",a);
printf("b : %i\n",b);
printf("c = a == b  = %i\n" , c_1);
printf("c = a <= b  = %i\n" , c_2);
printf("c = a >= b  = %i\n" , c_3);
printf("c = a != b  = %i\n" , c_4);
printf("c = a  > b  = %i\n" , c_5);
printf("c = a  < b  = %i\n" , c_6);
}
