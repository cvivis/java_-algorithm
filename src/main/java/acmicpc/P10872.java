package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10872 {
    public static void main(String[] args) throws IOException {
        P10872 up1851 = new P10872();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(up1851.factorial(num));
    }

    

    private int factorial(int num) {
        if(num <= 1)return 1;
        return factorial(num-1)*num;
    }
}
