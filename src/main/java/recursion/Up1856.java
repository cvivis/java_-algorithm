package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1856 {
    public static void main(String[] args) throws IOException {
        Up1856 up1851 = new Up1856();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(up1851.upstairs(num));
    }



    private int upstairs(int num) {
        if(num==1)return 1;
        else if(num==2) return 2;
        else if(num==3) return 4;
        else if(num<=0) return 0;
        return upstairs(num-1) + upstairs(num-2) + upstairs(num-3);
    }
}
