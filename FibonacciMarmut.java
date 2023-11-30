public class FibonacciMarmut {
    static int fibonacci (int x)
    {
        if (x <= 2) {
            return (1);
        } else {
            return (fibonacci(x - 1) + fibonacci(x - 2));
        }
    }
    public static void main(String[] args) {
        int x = 12;
        int jumlah = fibonacci(x);

        System.out.println("Pada akhir bulan "+ x +" jumlah pasangan marmut adalah "+ jumlah);
    }
}
