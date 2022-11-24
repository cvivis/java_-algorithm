package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        Fibonacci fibonacci = new Fibonacci();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N번째 수 출력하기
//        System.out.println(fibonacci.find(N,1,1));
        System.out.println(fibonacci.Nfind(N));
        System.out.println(fibonacci.noFibo(N));
    }
    private int Nfind(int N) {
        if(N<=2) return 1;
        return Nfind(N-2)+Nfind(N-1);
    }

    public int noFibo(int N){
        int first = 1;
        int second = 1;
        int result = 1;
        while(true){
            if(N<=2){
                break;
            }
            result = first + second;
            N--;
            first = second;
            second = result;
        }
        return result;
    }
}
