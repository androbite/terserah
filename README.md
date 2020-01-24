# terserah
ini project terserah, terserah mau dimasukin apa karena nama projectnya terserah
#include <iostream>
using namespace std;

struct nodeLinkedList{
		int data;
		//bisajuga next diganti namanya menjadi yang lainnya
		nodeLinkedList *selanjutnya;
	};
	
	//begituppun dengan kepala dan ekor bisa dirubah menjadi  tail dan head atau bisa juga yang lainnya.
	nodeLinkedList *kepala, *ekor, *bantu, *baru, *hapus;
	
	
void inisialisasi(){
	kepala = NULL;
	ekor = NULL;
}

void lihatIsi(){
	nodeLinkedList *lihat;
	lihat = kepala;
	
	while(lihat != NULL){
		cout<<lihat->data<<", ";
		lihat = lihat->selanjutnya;
	}
}

int menghitungList(){
	if(kepala==NULL){
		cout<<"Isi list kosong"<<endl;
		return 0;
	}else{
	//	nodeLinkedList *bantu = new nodeLinkedList;
		bantu = new nodeLinkedList;
		bantu = kepala;
		int jumlah = 1;
		
		while(bantu->selanjutnya != NULL){
//			jumlah += jumlah;
			jumlah = jumlah += 1;
//			kepala->selanjutnya = bantu;
			bantu = bantu ->selanjutnya;
		}
		return jumlah;
	}
}
void tambahDepan(int angka){
//	nodeLinkedList *baru = new nodeLinkedList;

	baru = new nodeLinkedList;
	baru -> data = angka;
	baru->selanjutnya = NULL;
	
	if(kepala == NULL){
	kepala = baru;
	ekor = baru;
	}else{
		baru ->selanjutnya = kepala;
		kepala = baru;
	}
}
//contoh untuk memberi pointer yang menunjuk ke node kedua
//nodeLinkedList *namaKedua = new nodeLinkedList;
//namaKedua = kepala->selanjutnya;

void tambahBelakang(int angka){
	
	baru = new nodeLinkedList;
	baru -> data = angka;
	baru->selanjutnya = NULL;
	
	if(kepala == NULL){
	kepala = baru;
	ekor = baru;
	}else{
		ekor ->selanjutnya = baru;
		ekor = ekor->selanjutnya;
}
}
	void tambahTengah(int posisi, int angka){
	
	int jumlah = menghitungList();
	
	
	if(jumlah < posisi){
		bantu =  kepala;
		
		//buat variabel varu untuk menyimpan posisi dari pointer *bantu
		int posisiBaru = 1;
		
		//Lopping sampai pointer *bantu menuju posisi-1
		for(int i =1; i<(posisi-1); i++){
			bantu = bantu->selanjutnya;
		}
		
		
		//sisipkan node *baru
		baru = new nodeLinkedList;
		baru->data = angka;
		baru->selanjutnya = NULL;
		
		baru->selanjutnya = baru->selanjutnya;
		bantu->selanjutnya = baru;
		cout<<"Data berhasil ditambahkan di tengah"<<endl;
		
	}else{
		cout<<"posisi memiliki jumlah list"<<endl;
	}
	
}

	

	int main(){
	cout<<"Isi list : "<<endl;
		tambahDepan(11);
		tambahBelakang(10);
		tambahDepan(13);
		tambahBelakang(14);
		tambahDepan(12);
		tambahTengah(2, 4);
		lihatIsi();  
   		cout<<endl;
		cout<<"jumlah list : "<<menghitungList()<<endl;


}
