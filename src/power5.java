import java.util.Scanner;

public class power5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(5);
        }
        else
            System.out.println(25);
    }


}
