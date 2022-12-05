package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeapMake {

    public static void main(String[] args) {
        int[] arr = {6,5,7,8};
        int[] arr2 = {6, 5, 3, 1, 8, 7, 2, 4 };
        int[] arr3 = {4,8,5,7,3,2,9,6,7};

        System.out.println(Arrays.toString(whileHeap(arr3)));
        System.out.println(Arrays.toString(makeHeap(arr,1)));
        System.out.println(Arrays.toString(makeHeap(arr,0)));
    }

    public static int[] makeHeap(int[] arr,int parentIdx){
        int leftIdx = parentIdx * 2 + 1; // 왼쪽노드
        int rightIdx = parentIdx * 2 + 2; // 오른쪽 노드
        int greaterIdx = parentIdx; // 클때 바꾸기 위한 idx

        if(leftIdx<arr.length && arr[leftIdx] > arr[parentIdx]) { // 뿌리 노드의 leftIdx는 없기 때문에 length랑 비교해 연산 제어
            greaterIdx = leftIdx;
        }
        else if(rightIdx<arr.length && arr[rightIdx] > arr[parentIdx]){ // 자식 노드 값이 커지면 부모노드랑 바꾸기
            greaterIdx = rightIdx; // 바꾸기 위한 idx, 전체 노드 순서대로 확인하기 위해 부모노드는 바뀌어선 안됨.
        }
        swap(arr,greaterIdx,parentIdx);

        return arr;
    }

    public static int[] whileHeap(int[] arr){
        for (int i = arr.length-1; i > 0  ; i--) { // 맨 마지막 idx 부터 확인하기
            int myIdx = i; //i는 변동 X
            if(myIdx%2==0){ // idx가 짝수일때
                int parent = (myIdx - 2)/2; // 부모구하기 역순
//                System.out.println("2n + 2 first parent: "+parent);
                while(arr[myIdx] > arr[parent]){ // 자식이 더 크거나 때
                    swap(arr,myIdx,parent); // 값만 바꿈
                    myIdx = parent; // 부모노드자리에서 다시 확인하기
                    if(myIdx == 0) break; // 확인할 노드가 루트 노드일때 확인 X
                    parent = (myIdx - 2)/2; // 수정한 myIdx의 부모구하기
//                    System.out.println("2n+2 parent:"+parent + " : " + arr[parent]);
//                    System.out.println("2n+2 my :"+myIdx + " : " + arr[myIdx]);
                }
            }
            else{  // idx가 홀수일때
                int parent = (myIdx - 1)/2;
//                System.out.println("2n + 1 first parent: "+parent);
                while(arr[myIdx] > arr[parent]){
                    swap(arr,myIdx,parent);
                    myIdx = parent;
                    if(myIdx == 0) break;
                    parent = (myIdx - 1)/2;
//                    System.out.println("2n+1 :" + parent + " : " + arr[parent]);
//                    System.out.println("2n+1 my :" + myIdx + " : " + arr[myIdx]);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

}
