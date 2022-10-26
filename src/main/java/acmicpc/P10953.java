package acmicpc;

import java.util.Scanner;

public class P10953 {
    //5
    //1,1
    //2,3
    //3,4
    //9,8
    //5,2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String[] str = sc.next().split(",");
            System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
        }
    }
}
