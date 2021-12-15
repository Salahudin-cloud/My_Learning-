#include<stdio.h>

void main () {
int bilangan [2][2];

bilangan[0][0] = 100;
bilangan[0][1] = 101;
bilangan[1][0] = 110;
bilangan[1][1] = 111;

printf("isi bilangan array  : \n");
printf("%i,%i \n", bilangan[0][0], bilangan[0][1]);
printf("%i,%i" , bilangan[1][0], bilangan[1][1]);

}
