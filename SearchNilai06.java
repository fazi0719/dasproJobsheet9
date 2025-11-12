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
System.out.println(" Nilai " +key+ " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
}
else {
System.out.println(" nilai yang dicari tidak ketemukan ");
}
}
}