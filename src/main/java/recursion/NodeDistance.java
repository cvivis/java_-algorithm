package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NodeDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        System.out.println(distance(num1,num2));
    }

    public static int distance(int num1, int num2){
        // 각각의 부모를 파악하는 방향으로 가야한다. 각수의 대소관계가 중요X, 같을때가 중요
        if(num1 > num2 ){//왼쪽수가 더 크면
            return distance(Math.floorDiv(num1,2),num2)+1; // 큰쪽에서 한칸 올라가기
        }
        else if(num1 < num2){ // 오른쪽 수가 더 크면
            return distance(num1,Math.floorDiv(num2,2))+1;
        }
        else { // 둘이 같다는것은 이전 재귀단계에서 둘이 같은 부모를 가졌다 / 같은 노드가 입력값이 들어왔다.
            return 0;
        }
    }
}
