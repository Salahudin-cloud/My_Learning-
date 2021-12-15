#include<stdio.h>

int main () {
double jumlah, gaji1,gaji2,gaji3;

printf("masukan gaji 1 = ");
scanf("%lf", &gaji1);
printf("masukan gaji 2 = ");
scanf("%lf", &gaji2);
printf("masukan gaji 3 = ");
scanf("%lf", &gaji3);
jumlah = gaji1 + gaji2 + gaji3;
printf("gaji 1 adalah %lf", jumlah);
return 0;
}
