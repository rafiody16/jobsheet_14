import java.util.Scanner;
public class PenjumlahanRekursif {
    static int rekursif(int f)
    {
        if (f == 1) {
            return (1);
        } else {
            return (f + rekursif(f-1));
        }
    }
    static String tampilRekursif(int f)
    {
        if (f == 1) {
            return ("1");
        } else {
            return (f + " + " + tampilRekursif(f-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjumlahan: ");
        int f = sc.nextInt();

        System.out.println(tampilRekursif(f)+ " = "+rekursif(f));
    }
    
}
