*PERCOBAAN 1*
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
Jawab: Error, karena arry bil dideklarasikan menggunakan tipe data int
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
Jawab: import java.util.Scanner;
public class  arrayBilangan06 {
    public static void main(String[] args) {
        int [] bil = {5,13,-7,17}; // inisialisasi elemen array

        System.out.println(bil [0]);
        System.out.println(bil [1]);
        System.out.println(bil [2]);
        System.out.println(bil [3]);
    } 
}

3. Ubah statement pada langkah No 4 menjadi seperti berikut
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
Jawab: Output masih sama dengan percobaan sebelumnya,Loop akan dimulai dari indeks 0 hingga indeks 3 (karena i < 4), maka mencetak setiap nilai elemen array satu per satu (bil[0], bil[1], bil[2], bil[3]).
4.  Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
Jawab: Program akan mencetak 5, 13,-7, 17, lalu berhenti dan menampilkan pesan eror di atas.Eror ini bisa terjadi karena array bil hanya memiliki 4 elemen sedangkan di statement perulangan dipaksa untuk berjalan hingga nilai i mencapai 4.


*PERCOBAAN 2*
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Jawab: Tidak terjadi perubahan, karena kedua kondisi (i < 10 dan i < nilaiAkhir.length) memiliki nilai yang sama, sehingga program tetap meminta input untuk 10 elemen (indeks 0 sampai 9).
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
Jawab: Untuk memastikan program mengakses setiap elemen array, mulai dari indeks 0 hingga indeks terakhir yang valid (0-9), dan tidak pernah mencoba mengambil data dari kotak yang sudah tidak ada (indeks 10 atau lebih), untuk mencegah error program.
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
Jalankan program dan jelaskan alur program!
Jawab: 1. int[] nilaiAkhir = new int[10];
        Membuat array nilaiAkhir dengan kapasitas 10 elemen bertipe integer.
       2. Pengecekan Kondisi: Di dalam loop, terdapat statement if (nilaiAkhir[i] > 70).Pada setiap iterasi, program akan memeriksa     apakah nilai yang disimpan pada indeks i (yaitu nilaiAkhir[i]) lebih besar dari 70. 
       3. Jika nilaiAkhir[i] > 70, maka ditampilkan pesan "Mahasiswa ke-i lulus!". Jika tidak (≤70), maka tidak ada pesan yang ditampilkan untuk mahasiswa tersebut.       
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
seperti ilustrasi output berikut:
Jawab: import java.util.Scanner;
public class array_nilaiModif06 {

public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke- "+i+" : ");
            nilaiAkhir [i] = sc.nextInt();
        }

            for (int i =0; i < nilaiAkhir.length; i++){
                if (nilaiAkhir[i] > 70){
                    System.out.println("Nilai akhri ke-"+i+" lulus! ");
                }
                else{
                    System.out.println("Nilai akhri ke-"+i+" Tidak lulus! ");
            }
            }
        }
    }

*PERCOBAAN 3*
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)
agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa
yang memiliki lebih besar dari 70 (>70).
Jawab:   import java.util.Scanner;
public class arrayRataNilai1_06 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiMhs = new int [10];
        int totalLulus = 0,jumlahLulus = 0 ;
        double total = 0, rata2;

        for (int i =0; i <nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+":");
            nilaiMhs[i] = sc.nextInt();
            
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        if (nilaiMhs[i] >70) {
            totalLulus += nilaiMhs[i];
            jumlahLulus++;

        }
    }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+ rata2);
        System.out.println("Jumlah mahasiswa yang lulus = "+ jumlahLulus);
    }
}

2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan
output seperti berikut ini:
jawab: import java.util.Scanner;
public class arrayRataNilai1_06 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Masukkan jumlah mahasiswa: ");
int jmlMhs = sc.nextInt();

int [] nilaiMhs = new int [jmlMhs];
        int totalLulus = 0,jumlahLulus = 0 ;
        int totalTidakLulus = 0, jumlahTidakLulus = 0;
        double total = 0, rata2, rata2TidakLulus;


          for (int i =0; i <nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+":");
            nilaiMhs[i] = sc.nextInt();
 }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        if (nilaiMhs[i] >70) {
            totalLulus += nilaiMhs[i];
            jumlahLulus++;

        }
    else{
         totalTidakLulus +=nilaiMhs[i];
            jumlahTidakLulus ++;
            totalLulus += 0;  
           }
}

rata2 = totalLulus/jumlahLulus;
rata2TidakLulus = totalTidakLulus/ jumlahTidakLulus;

System.out.println("Rata rata nilai mahasiswa yang lulus : "+rata2);
System.out.println("Rata rata nilai mahasiswa yang tidak lulus : " +rata2TidakLulus);


}
}

*PERCOBAAN 4*
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
atas.
Jawab: Statement break digunakan untuk menghentikan perulangan secara langsung, walaupun kondisi perulangan for belum selesai. Jadi jika nilai yang dicari (key) sudah ditemukan  di dalam array (arrNilai[i]), maka program akan menyimpan posisi indeksnya ke variabel hasil dan langsung keluar dari perulangan for (tidak melanjutkan pengecekan ke elemen berikutnya).
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. 
Jawab: 
import java.util.Scanner;
public class SearchNilai06{
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
int jumlah =0, key = 0, hasil =0;

System.out.print("Masukkan nilai yang akan diinput :");
 jumlah = sc.nextInt();
    int [] arrNilai = new int [jumlah];
     

    for ( int i = 0; i < arrNilai.length;i++){
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ ":");
            arrNilai[i]=sc.nextInt();
    }

System.out.print("Masukkan nilai yang akan dicari:");
 key = sc.nextInt ();

for ( int i = 0; i < arrNilai.length;i++){
if ( key == arrNilai[i]){
hasil=i;
break;
}
}

System.out.println();
if (hasil != 0){
System.out.println("Nilai" +key+ " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
}
else {
System.out.println(" nilai yang dicari tidak ketemukan ");
}
}
}
 

3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.
Jawab: 
import java.util.Scanner;
public class SearchNilai06{
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
int jumlah =0, key = 0, hasil =0;

System.out.print("Masukkan nilai yang akan diinput :");
 jumlah = sc.nextInt();
    int [] arrNilai = new int [jumlah];
     

    for ( int i = 0; i < arrNilai.length;i++){
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ ":");
            arrNilai[i]=sc.nextInt();
    }

System.out.print("Masukkan nilai yang akan dicari:");
 key = sc.nextInt ();

for ( int i = 0; i < arrNilai.length;i++){
if ( key == arrNilai[i]){
hasil=i;
break;
}
}

System.out.println();
if (hasil != 0){
System.out.println("Nilai" +key+ " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
}
else {
System.out.println(" nilai yang dicari tidak ketemukan ");
}
}
}
