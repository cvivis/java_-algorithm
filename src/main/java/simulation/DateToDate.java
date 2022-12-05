package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateToDate {

    static int[] dates = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input  = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        System.out.println(dateCal(c,d) - dateCal(a,b)+1);
    }
    public static int dateCal(int m , int d){
        int days = 0;
        for (int i = 1; i < m; i++) {
            days += dates[i];
            System.out.println("days : "+days);
        }
        days+=d;
        return days;
    }
}
