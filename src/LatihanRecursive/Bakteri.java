package LatihanRecursive;

import java.util.Scanner;

public class Bakteri {
    public static int HitungVirusAkhir(int virusAwal, int jam) {
        if (jam > 1) {
            return HitungVirusAkhir(virusAwal * 3, jam - 1);
        } else {
            return virusAwal;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jumlah virus awal = ");
        int virusAwal = scan.nextInt();
        System.out.print("Jam = ");
        int jam = scan.nextInt();
        
        //call function
        int virusAkhir = HitungVirusAkhir(virusAwal, jam);
        
        //output
        System.out.println("Jumlah virus akhir = " + virusAkhir);
    }
}
