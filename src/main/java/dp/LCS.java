package dp;

import java.util.Arrays;

public class LCS {

    public static void main(String[] args) {
        String str = "ABCDCBA";
        String str2 = "DCABDC";

        solution(str, str2);
    }

    public static int solution(String str, String str2){

        int[][] arr = new int[str2.length()][str.length()];

        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i)+ " : ");
            for (int j = 0; j < str.length(); j++) {
                System.out.print(str.charAt(j));
                arr[i][j] = str.charAt(j);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));

        return 3;
    }

}
