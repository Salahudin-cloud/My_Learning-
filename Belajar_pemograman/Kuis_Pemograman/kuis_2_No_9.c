#include<stdio.h>

void main() {
//satu dimensi
char nama = "aku";
int angka[1] ;
angka[0] = 0 ;
angka[1] = 1;
//multi dimensi
int nomor[0][1] ;
nomor[0][0] = 0;
nomor[0][1] = 1;

printf("angka 0 = %i\n", angka[0]) ;
printf("angka 1 = %i\n", angka[1]);
printf("%i,%i\n", nomor[0][0], nomor[0][1]);
printf("nama = %s\n" , nama);
}

