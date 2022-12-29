import java.util.Scanner;

public class pythagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num1 = input.nextInt();
        long num2 = input.nextInt();
        long num3 = input.nextInt();
        long sqr1 = num1 * num1;
        long sqr2 = num2 * num2;
        long sqr3 = num3 * num3;
        if ((sqr1 + sqr2) == sqr3 || (sqr1 + sqr3) == sqr2 || (sqr3 + sqr2) == sqr1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
