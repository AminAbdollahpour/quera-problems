import java.util.Scanner;
public class barAksBarabar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int z = n;
        int k = 0;
        int x = 0;

        while (n != 0)
        {
            x = n % 10;
            k = x + (10 * k);
            n = (n - x) / 10;
        }
        if (z == k) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}