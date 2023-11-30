import java.util.Scanner;
public class CekPrimaRekursif {
    static boolean cekPrima(int x, int y)
    {
        if (x <= 1) {
            return (false);
        } else if (y == x) {
            return (true);
        } else if (x % y == 0) {
            return (false);
        } else {
            return cekPrima(x, y + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int x = sc.nextInt();

        if (cekPrima(x, 2)) {
            System.out.println(x + " adalah bilangan prima");
        } else {
            System.out.println(x + " bukan bilangan prima");
        }
    }
}
