#include<stdio.h>
#define pi 3.14
int main() {
int jari_jari  ;
float luas ;
printf("masukan jari jari = ");
scanf("%i" , &jari_jari);
luas = ( pi * jari_jari * jari_jari)/2;
printf("luasnya adalah %.3f" , luas);
return 0;

}
