package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1851 {
    public static void main(String[] args) throws IOException {
        Up1851 up1851 = new Up1851();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        up1851.recursionStar(num);
    }



    private void recursionStar(int num) {
        if(num <= 0)return;
        System.out.print("*");
        recursionStar(num-1);
    }
}
