import java.util.Scanner;

public class magicalSticks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(n / 2 + 1);
        }
    }
}
