import java.io.*;

public class Main {

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main (String args[]) {
        int sum = 10;
        int cnt = 3;
        System.out.println(sum/cnt);
        int avg = (int)((double)(sum) / cnt);
        System.out.println(avg);
    }
}