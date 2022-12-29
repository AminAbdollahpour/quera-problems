import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = -100;
       // int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // arr[i] = input.nextInt();
            int a = input.nextInt();
            if (a > m) {
                m = a;
            }
        }
        System.out.println(m);

    }
}
