import java.util.Scanner;
public class DeretDescendingRekursif {
    static void rekursif (int x)
    {
        if (x <= 0) {
            System.out.println(x);
            return;
        }
        System.out.print(x + ", ");
        rekursif(x - 1);
    }
    static void iteratif(int x)
    {
        for (int i = x; i >=0; i--) {
            System.out.print(i);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int x = sc.nextInt();

        System.out.print("Rekursif: ");
        rekursif(x);
        System.out.print("Iteratif: ");
        iteratif(x);
    }
}
