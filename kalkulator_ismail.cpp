#include <iostream>
using namespace std;

int main(){
int x,y,hasil;
	menu :
    cout << "Kalkulator Ismail \n";
    cout << "================= \n";
    cout << "Pilihan Menu : \n";
    cout << "1.Penjumlahan (+)\n";
    cout << "2.Pengurangan (-)\n";
    cout << "3.Perkalian (*)\n";
    cout << "4.Pembagian (/)\n\n";
  	cout<<"ketikkan angka 1: ";
 cin>>x;
 	cout<<"ketikkan angka 2: ";
 cin>>y;
 
 int z;
 cout<<"pilih operasi perhitungan";
 cin>>z;
 
 if (z==1)
 {
 	hasil=x+y;
 	cout<<"hasil penjumlahan = "<<hasil<<endl;
 }
  if (z==2)
 {
 	hasil=x-y;
 	cout<<"hasil pengurangan = "<<hasil<<endl;
 }
  if (z==3)
 {
 	hasil=x*y;
 	cout<<"hasil perkalian = "<<hasil<<endl;
 }
   if (z==4)
 {
 	hasil=x/y;
 	cout<<"hasil pembagian = "<<hasil<<endl;
 } 
   ; 
    cout<<"selamat mecoba" ;
    cout<<"sekian trimakasih " ;
    
}
