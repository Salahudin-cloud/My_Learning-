#include<stdio.h>

struct Siswa {
 char nama[50] ;
 char sekolah[50];
};

void main() {
struct Siswa siswa01 ;

strcpy(siswa01.nama , "andri nugroho") ;
strcpy(siswa01.sekolah , "SMA 1 Lumut Ijo");

printf("%s bersekolah di %s " , siswa01.nama , siswa01.sekolah) ;
}
