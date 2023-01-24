import java.util.Scanner;
public class firstArray1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int x = 0; int c = 0;
        int[]s = new int [n];
        for(int i = 0 ; i<n ; i++){
            s[i] = input.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            if (i%2 != s[i] % 2){
                if(i%2 == 1){
                    c++; 
                } else{
                    x++;
                }
            }
        }
        if( x == c ){
            System.out.println(x);
        } else{
            System.out.println(-1);
        }
    }
}