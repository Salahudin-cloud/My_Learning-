#include<stdio.h>

struct  DataMahasiswa {
    char *nama ;
    char *alamat ;
    int nim ;
};


void main() {
struct DataMahasiswa mhs ;

mhs.nama = "M Salahudin " ;
mhs.alamat = "pinggirrejo wates" ;
mhs.nim = 2122004;

printf("Nama : %s\n", mhs.nama) ;
printf("Alamat : %s\n" , mhs.alamat) ;;
printf("Nim = %i" , mhs.nim);

}
