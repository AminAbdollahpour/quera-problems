import java.util.Scanner;

public class sigmaGir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int x = 0;
        int z = 0;
        if(n < 0 ||m > 10)
            return;
        for (int i = -10; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(j == 0)
                    continue;
                x = (int) Math.pow(i + j, 3);
                z =z  + x / (int) Math.pow(j, 2);
            }
        }
        System.out.println(z);
    }

}