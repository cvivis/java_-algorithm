import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] arr2d = new int[100][100];

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 1) {
                for (int j = n-1; j >= 0; j--) {
                    arr2d[j][i] = count;
                    count++;
                }
            }
            else{
                for (int j = 0; j < n; j++) {
                    arr2d[j][i] = count;
                    count++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}