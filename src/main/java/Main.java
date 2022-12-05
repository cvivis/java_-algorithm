import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        System.out.println(sum(n));
        System.out.println(squarePlace(n));
    }

    public static int squarePlace(int  n) { // 각 자리의 제곱의 합을 구하기 위해선 각 n을 10으로 나눈 나머지의 제곱
        if(n < 10) {
            return (int)Math.pow(n,2);
        }
        return squarePlace(n/10) + (int)Math.pow(n%10,2);
    }

    public static int sum(int n) { // n까지의 합을 구하기 위해선 n-1까지의 합이 구해져야 한다.
        if(n == 0) {
            return 0;
        }
        return sum(n-1) + n;
    }

    public static void print1(int n) {
        if(n == 0) {
            return;
        }
        print1(n-1);
        System.out.printf("%d ",n);
    }

    public static void print2(int n) {
        if(n == 0) {
            return;
        }
        System.out.printf("%d ",n);
        print2(n-1);
    }
}