package acmicpc;

import java.io.*;

public class P11729 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        P11729 p11729 = new P11729();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int first = 1;
        int second = 2;
        int third = 3;
        System.out.println((int)Math.pow(2,num) - 1 );
        p11729.hanoi(num,first,third,second);
        bw.flush();
        bw.close();
    }

    private void hanoi(int num,int from,int to,int other) throws IOException {
        if(num == 1 ){
             bw.write(from+" "+to+"\n");// 종료조건 마지막 1개일때, 1 -> 3으로 옮기기
        }else{
            hanoi(num-1,from,other,to); // if num = 3이면 2개를 가운데로 옮기고
            bw.write(from+" "+to+"\n"); // 가장 큰 마지막 옮기기
            hanoi(num-1,other,to,from); // 이웃의 2개를 3번째 걸로 옮기둥
        }

    }
}
