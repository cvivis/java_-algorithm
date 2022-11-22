package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static int sumAll(List<Integer> list) {
        if(list.size()==0)return 0;
        int add = list.remove(list.size()-1);
        return sumAll(list) + add;
    }
    public static void main(String[] args) throws IOException {
        ListSum arraySum = new ListSum();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
        int[] arr = {7,3,2,9};
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);
        System.out.println(ListSum.sumAll(list));

    }

    


}
