#include<stdio.h>

int main () {
char nama ;
int dasar_pemograman, algoritma, bahasa_inggris, matematika, ipk , jumlah_nilai_matkul;

printf("mssukan insial nama mahasiswa  = ");
scanf("%c",&nama);
printf("masukan nilai mata pelajaran = ");
scanf("%i",&dasar_pemograman);
printf("mssukan nilai mata pelajaran = ");
scanf("%i",&algoritma);
printf("masukan nilai mata pelajaran = ");
scanf("%i",&bahasa_inggris);
printf("masukan nilai mata pelajaran = ");
scanf("%i",&matematika);
jumlah_nilai_matkul = dasar_pemograman + algoritma + bahasa_inggris + matematika ;
ipk = jumlah_nilai_matkul / 4 ;
printf("Nama Mahasiswa    : %c\n",nama);
printf("Nilai Dasar Pemograman : %i\n", dasar_pemograman);
printf("Nilai Algoritma : %i\n",algoritma);
printf("Nilai Bahsa Inggris : %i\n", bahasa_inggris);
printf("Nilai matematika : %i\n", matematika);
printf("Nilai IPK  %i\n",ipk);
return 0;

}
