import java.util.Scanner;

public class maxMatrix {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int x = 0;
        int n = reader.nextInt();
        int[][] numbers = new int[n][n];

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {

                if (i == 0 || j == 0) {
                    numbers[i][j] = 1;
                } else {
                    numbers[i][j] = numbers[i - 1][j] + numbers[i][j - 1];
                }
                if (numbers[i][j] > x) {

                    x = numbers[i][j];
                }


            }
        }


        System.out.println(x);
    }
}