PERCOBAAN 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
Jawab: Error, karena arry bil dideklarasikan menggunakan tipe data int
3. Ubah statement pada langkah No 4 menjadi seperti berikut
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
Jawab: Output masih sama dengan percobaan sebelumnya,Loop akan dimulai dari indeks 0 hingga indeks 3 (karena i < 4), maka mencetak setiap nilai elemen array satu per satu (bil[0], bil[1], bil[2], bil[3]).
4.  Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
Jawab: Program akan mencetak 5, 13,-7, 17, lalu berhenti dan menampilkan pesan eror di atas.Eror ini bisa terjadi karena array bil hanya memiliki 4 elemen sedangkan di statement perulangan dipaksa untuk berjalan hingga nilai i mencapai 4.

PERCOBAAN 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Jawab: Tidak terjadi perubahan, karena kedua kondisi (i < 10 dan i < nilaiAkhir.length) memiliki nilai yang sama, sehingga program tetap meminta input untuk 10 elemen (indeks 0 sampai 9).
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
Jawab: Untuk memastikan program mengakses setiap elemen array, mulai dari indeks 0 hingga indeks terakhir yang valid (0-9), dan tidak pernah mencoba mengambil data dari kotak yang sudah tidak ada (indeks 10 atau lebih), untuk mencegah error program.
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
Jalankan program dan jelaskan alur program!
Jawab: 