import java.util.Arrays;
import java.util.Scanner;

public class arrayPlus1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int b [] = new int[t+1];
        for (int i = 0; i < t; i++)
        {
            b [i] = input.nextInt();
        }
        Arrays.sort(b);
        System.out.println(b[t] - b[1]);
    }
}