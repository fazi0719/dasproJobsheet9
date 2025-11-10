import java.util.Scanner;
public class array_nilai06modif {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke- "+i+" : ");
            nilaiAkhir [i] = sc.nextInt();
        }

            for (int o =0; o < nilaiAkhir.length; o++){
                if (nilaiAkhir[o] > 70){
                    System.out.println("Mahasiswa ke-"+o+" lulus! ");
                }
                
            }
        }
    }


