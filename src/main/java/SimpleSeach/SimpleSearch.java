package SimpleSeach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int find = Integer.parseInt(br.readLine());
        boolean check = false;

        for (int i = 0; i < num; i++) {
            if(Integer.parseInt(arr[i]) == find){
                System.out.println(i+1);
                check = true;
            }
        }
        if(check == false) System.out.println("-1");
    }
}
