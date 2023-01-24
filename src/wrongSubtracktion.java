import java.util.Scanner;

public class wrongSubtracktion {
    public static void main(String[] arges) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        for (int i = 1; n >= i; i++) {
            if (m % 10 == 0) {
                m /= 10;

            } else {
                m--;
            }
        }
        System.out.println(m);
    }
}
