import java.util.Scanner;

public class subMultiplesof5and3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int P = 0;
        for (int i = 0; i < n; i++) {
            if ((i % 3 == 0 || i % 5 == 0)) {
                P += i;
            }
        }
        System.out.println(P);
    }
}

