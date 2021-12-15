#include<stdio.h>
struct DataMhs {
char *nama ;
int nim ;
char *alamat;
};
void main () {
struct DataMhs mhs;
mhs.nama = "salahudin" ;
mhs.nim = 2122004;
mhs.alamat = "Pinggirrejo Wates" ;

printf("Nama  =  %s\n", mhs.nama);
printf("Nim = %i\n", mhs.nim);
printf("alamat = %s\n", mhs.alamat);
}
