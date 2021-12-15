#include<stdio.h>

void main () {
char huruf[2][5] ;

huruf[0][0] = 'a';
huruf[0][1] =  'b';
huruf[1][0] = 'c' ;
huruf[1][1] = 'd';
huruf[2][0] = 'e';
huruf[2][1] = 'f';
huruf[3][0] = 'g';
huruf[3][1] = 'h';
huruf[4][0] = 'i';
huruf[4][1] = 'j';
printf("%c,%c,%c,%c,%c\n",huruf[0][0],huruf[0][1],huruf[1][0],huruf[1][1],huruf[2][0]);
printf("%c,%c,%c,%c,%c",huruf[2][1],huruf[3][0],huruf[3][1],huruf[4][0],huruf[4][1]);

}
