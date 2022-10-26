package acmicpc;

import java.util.Scanner;

public class P10992 {
    //2×N-1
    //   *
    //  * *
    // *   *
    //*******
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            if(i == 1){
                System.out.print("*");
            }else{
                for (int j = 1; j <= i * 2 - 1; j++) {
                    if(j == 1 || j==i*2-1 ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
        for (int i = 0; i < num*2-1; i++) {
            System.out.print("*");
        }
    }
}
