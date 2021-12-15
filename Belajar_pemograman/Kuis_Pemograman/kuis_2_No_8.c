#include<stdio.h>
//tipe data struc
struct  DataMahasiswa {
    int nim ;
};


void main() {
//tipe data
struct DataMahasiswa mahasiswa_1 ; // sturct
mahasiswa_1.nim = 21222004;
int umur = 14;//initeger
float pi = 3.14 ; // float
double angka = 41.15 ; //double
char a = 'a' ; // character
char nama[] = "salahudin"; // array
char b = 'salahudin' ;//stirng

//menampilkan tipe data :
printf("Nim = %i\n" , mahasiswa_1.nim);
printf("umur = %i\n" , umur) ;
printf("pi = %f\n", pi) ;
printf("angka = %lf \n" , angka);
printf("a = %c\n" , a) ;
printf("nama = %s\n" , nama);
printf("b = %s", b );
}
