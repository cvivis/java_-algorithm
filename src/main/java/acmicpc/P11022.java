package acmicpc;

import java.util.Scanner;

public class P11022 {
//5
//1 1
//2 3
//3 4
//9 8
//5 2
//    -----
//Case #1: 1 + 1 = 2
//Case #2: 2 + 3 = 5
//Case #3: 3 + 4 = 7
//Case #4: 9 + 8 = 17
//Case #5: 5 + 2 = 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < count; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i+1,num1,num2,num1+num2);
        }
    }
}
