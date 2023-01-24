import java.util.Scanner;

public class biggestAmel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                n = n / i;
            }
        }
        System.out.println(Math.max(n, n));
    }
}