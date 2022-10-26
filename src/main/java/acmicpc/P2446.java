package acmicpc;

import java.util.Scanner;

public class P2446 {
    //2×N-1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//*********
// *******
//  *****
//   ***
//    *
//   ***
//  *****
// *******
//*********

//*********
// *******
//  *****
//   ***
//    *
//   ***
//  *****
// *******
//*********