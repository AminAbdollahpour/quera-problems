import java.util.Scanner;

public class milkDish {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = Input.nextInt();
        int c = Input.nextInt();
        double A = (a + b + c)/(3.0);
        if(a == A && b == A && c == A)
        {
            if(a == b && a == c && c == b)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }
        else
        {
            System.out.println(2);
        }
    }
}