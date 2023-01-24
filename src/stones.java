import java.util.Scanner;

public class stones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String stons = input.next();
        char[] characters = stons.toCharArray();
        char c = ' ';
        int x =0;
        for (int i = 0;i<n;i++){
            if (c==characters[i]){
                x++;

            }
        c=characters[i];
        }
        System.out.println(x);

    }

}