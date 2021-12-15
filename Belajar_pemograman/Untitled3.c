#include<stdio.h>


int main () {
  char nama[20], tanggal[20] ;
  int pill, kelas_pill , jumlah_penumpang;
    printf("masukan nama : ");
    gets(nama);
    printf("masukan tanggal penerbangan anda dengan format(DD/MM/YY) : ");
    gets(tanggal);
    printf("masukan pilihan anda (masukan No):   ");
    scanf("%i",&pill);
    printf("masukan pilihan kelas anda (masukan No):");
    scanf("%i",&kelas_pill);
    printf("masukan jumlah penumpang : ");
    scanf("%i",&jumlah_penumpang);
return 0 ;
}
