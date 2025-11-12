import java.util.Scanner;
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