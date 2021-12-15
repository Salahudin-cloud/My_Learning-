#include<stdio.h>

void main () {
int a ;
a = 0 && 1 ;
printf("isi a : %i\n",a);
a = 1 && 1 ;
printf("isi a : %i\n",a);
a = 0  || 1 ;
printf("isi a : %i\n",a);
a = 0 || 0 ;
printf("isi a : %i\n",a);
a =  !0 ;
printf("isi a : %i\n",a);

}
