import java.util.Scanner;
public class arrayNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] nilaiAkhir = new int [10];

        for (int i = 0; i <10; i++){
            System.out.print("Masukkan nilai akhir ke- "+i+" : ");
            nilaiAkhir [i] = sc.nextInt();
        }

            for (int o =0; o < 10; o++){
                System.out.println("Nilai akhri ke-"+o+" adalah "+ nilaiAkhir[o]);
            }
        }
    }

