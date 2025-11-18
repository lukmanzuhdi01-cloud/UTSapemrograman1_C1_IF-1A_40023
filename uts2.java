import java.util.Scanner;
public class uts2 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String menu = null;
        int pilihan;
        int gaji;
         
        System.out.println("menu");
        System.out.println("1. gaji bersih");
        System.out.println("2. gaji pokok");
        System.out.println("3. tunjangan transportasi");
        System.out.println("4. tunjangan makan");
        System.out.println("masukan pilihan");
        pilihan = ns.nextInt();
        System.out.println("masukkan gaji");
        gaji = ns.nextInt();
        
        if (gaji < 5000000){
            System.out.println("pendapatan anda rendah");
        }
        else if(gaji == 5000000 && gaji == 10000000){
            System.out.println("pendapatan anda sedang");
        }
        else if(gaji > 10000000){
            System.out.println("pendapatan anda tinggi");
        }
        ns.close();
    }        
}