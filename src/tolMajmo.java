import java.util.ArrayList;
import java.util.Scanner;
public class tolMajmo {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int m = Input.nextInt();
        int s = Input.nextInt();
        System.out.println(BiggerOne(m , s));
        System.out.println(SmallerOne(m , s));

    }
    public static int BiggerOne(int m , int  s) {
        int a = (s / 9);
        int b = m - (s / 9);
        int c = s - (a*9);
        int d = m - (s / 9) - 1;
        int[] ints = new int[m];
        if((s/9.0) > m) {
            return -1;
        }
        else if (m > s) {
            return -1;
        }
        if(s > 9) {
            for(int i = 0 ; i < a ; i++) {
                ints[i] = 9;
            }
            if(a < m) {
                ints[a] = c;
            }
            if(a + 1 < m) {
                for(int i = a+1 ; i < m ; i++) {
                    ints[i] = 0;
                }
            }
        }
        else {
            int e = 8;
            for(int i = 0 ; i <= 0;) {
                i = s / e;
                e--;
            }
            ints[0] = e;
            int f = s - e;
            ints[1] = f;
            for(int i = 2 ; i < m ; i++) {
                ints[i] = 0;
            }
        }
        int g = 0;
        for(int i = 0 ; i < m ; i++) {
            g = g + ints[i];
            g = g * 10;
        }
        g = g / 10;
        return g;
    }
    public static int SmallerOne(int m , int s) {
        int a = s / 9;
        int[] ints = new int[m];
        int b = m - a;
        int c = s - (a)*9;
        if(s > 9) {
            for(int i = b ; i < m ; i ++) {
                ints[i] = 9;
            }
            if(b == 1) {
                ints[0] = c;
                int d = 0;
                for(int i = 0 ; i < m ; i++) {
                    d = d + ints[i];
                    d = d * 10;
                }
                d = d / 10;
                return d;
            }
            else if(b == 2) {
                ints[0] = 1;
                ints[1] = c - 1;
                int d = 0;
                for(int i = 0 ; i < m ; i++) {
                    d = d + ints[i];
                    d = d * 10;
                }
                d = d / 10;
                return d;
            }
            else if(b == 0) {
                int d = 0;
                for(int i = 0 ; i < m ; i++) {
                    d = d + ints[i];
                    d = d * 10;
                }
                d = d / 10;
                return d;
            }
            else {
                ints[0] = 1;
                ints[b - 1] = c - 1;
                for(int i = 1 ; i < b - 1 ; i++) {
                    ints[i] = 0;
                }
                int d = 0;
                for(int i = 0 ; i < m ; i++) {
                    d = d + ints[i];
                    d = d * 10;
                }
                d = d / 10;
                return d;
            }
        }
        else if(m > s) {
            return -1;
        }
        else if(s / 9 > m) {
            return -1;
        }
        else {
            int d = s;
            for(int i = 8 ; i > 0 ; i++) {
                if(d / i > 0) {
                    if(m == 1) {
                        ints[0] = s;
                    }
                    if(m > 1) {
                        ints[0] = 1;
                        for(int j = 1 ; j < m -1 ; j++) {
                            ints[j] = 0;
                        }
                        ints[m] = s  - 1;
                    }

                }
            }
            int e = 0;
            for(int i = 0 ; i < m ; i++) {
                d = d + ints[i];
                d = d * 10;
            }
            d = d / 10;
            return d;
        }
    }
}