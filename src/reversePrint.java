import java.util.Scanner;

public class reversePrint {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String javab = "";
        int n;
        int shomarande = 0;
        while (true) {
            n = scanner.nextInt();
            if(n == 0)
                break;

            if(shomarande==0)
                javab = String.valueOf(n);

            else
                javab = String.valueOf(n) + '\n' + javab;
            shomarande++;
        }


        System.out.println(javab);

    }

}
