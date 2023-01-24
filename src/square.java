import java.util.Scanner;

public class square {
    static void print_square(int n) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int radif = 8;
        print_square(radif);
    }
}
