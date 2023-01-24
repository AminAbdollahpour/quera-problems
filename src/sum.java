import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int[] array = new int[12];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        // bara 2 ta for mitoni har dotash ro ba i bezani lazem nist khas bashe
        for (int i = 0; i < 12; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}