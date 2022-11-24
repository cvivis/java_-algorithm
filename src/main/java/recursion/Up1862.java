package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1862 {
    int[] chk= new int[110]; //f(k)가 호출되면, 호출 했다는 것을 1로 기록해 두기 위한 배열

    long[] d = new long[110]; //f(k)의 값을 기록해 두기 위한 배열

    public static void main(String[] args) throws IOException {
        Up1862 up1862 = new Up1862();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N번째 수 출력하기
        System.out.println(up1862.Nfind(N));

    }
    private long Nfind(int N) {
        if(chk[N] == 1) return d[N];
        chk[N] = 1;
        if(N<=2) return d[N]=1;
        return d[N] = (Nfind(N-2)+Nfind(N-1))%1000000007;
    }
}
