package acmicpc;

import java.util.Scanner;

public class P10991 {
    //2×N-1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if(j>0 || j<i-1){
                    System.out.print("* ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
