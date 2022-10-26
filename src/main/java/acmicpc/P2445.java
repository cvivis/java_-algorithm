package acmicpc;

import java.util.Scanner;

public class P2445 {
    //2×N-1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num*2-1; i++) {
            if(i<num) {
                for (int j = 0; j < num; j++) {
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = num; j <= num * 2 - 1; j++) {
                    if (j >= num * 2 - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }else{
                for (int j = 0; j < num; j++) {
                    if (j < num - (i - num) - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = num; j <= num * 2 - 1; j++) {
                    if (j > i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
