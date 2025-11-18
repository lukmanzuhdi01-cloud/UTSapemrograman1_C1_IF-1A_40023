import java.util.Scanner;
public class uts {

    public static void main(String[] args) {
    Scanner ns =new Scanner(System.in);
    double Ttransport, Tmakan, rerata, gajiB, gajiP, biayaK;
    int total;
    
    System.out.println("Masukkan gaji bersih");
    gajiB = ns.nextDouble();
    System.out.println("Masukkan gaji pokok");
    gajiP = ns.nextDouble();
    System.out.println("Masukkan tunjangan transport");
    Ttransport = ns.nextDouble();
    System.out.println("Masukkan tunjangan makan");
    Tmakan =ns.nextDouble();
    
    
    double potongan = gajiB * 0.10; 
    
    ns.close();


    }
    
}