package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeapMake {

    public static void main(String[] args) {
        int[] arr = {6,5,7,8};
        int[] arr2 = {6, 5, 3, 1, 8, 7, 2, 4 };
        int[] arr3 = {4,8,5,7,3,2,9,6,7};
        int[] arr4 = {9,8,4,7,3,2,5,6,1};

//        int[] arr5 = {2,3,5,1,4};
//        for (int i = (arr5.length-2)/2; i >=0; i--) {
////                System.out.println(Arrays.toString(makeHeap(arr4,i)));
//            makeHeap(arr5,i,arr5.length);
//        }
//        System.out.println(Arrays.toString(arr5));


        int len = arr4.length-1;
        int arrTemp = arr4.length-2;
        while(len>0){
            System.out.println("len: "+len);
            System.out.println("arrTemp: "+arrTemp);
            for (int i = (arrTemp)/2; i >=0; i--) {
//                System.out.println(Arrays.toString(makeHeap(arr4,i)));
                makeHeap(arr4,i,len);
            }
            swap(arr4,0,len);
            len--;
            arrTemp--;
            System.out.println(Arrays.toString(arr4));
        }
        System.out.println("정렬 결과: "+Arrays.toString(arr4));
//
//
//        System.out.println("------ ");
//
//        System.out.println(Arrays.toString(whileHeap(arr3)));
//        System.out.println(Arrays.toString(makeHeap(arr,3)));
    }

    public static int[] makeHeap(int[] arr,int parentIdx,int arrSize){

//        if(parentIdx>= (int)Math.sqrt(arrSize))return arr;
        int leftIdx = parentIdx * 2 + 1; // 왼쪽노드
        int rightIdx = parentIdx * 2 + 2; // 오른쪽 노드
        int greaterIdx = parentIdx; // 클 때 바꾸기 위한 idx

        if(leftIdx<arrSize && arr[leftIdx] > arr[greaterIdx]) { // 뿌리 노드의 leftIdx는 없기 때문에 length랑 비교해 연산 제어
            greaterIdx = leftIdx; // 바꾸기 위한 idx, 전체 노드 순서대로 확인하기 위해 부모노드는 바뀌어선 안됨.
        }
        if(rightIdx<arrSize && arr[rightIdx] > arr[greaterIdx]){ // 자식 노드 값이 커지면 부모노드랑 바꾸기. 대소 비교가 레프트랑도 되어야 하기에 if로 써주기
            greaterIdx = rightIdx;
        }
        System.out.println(Arrays.toString(arr));
        if(greaterIdx != parentIdx){ // 더 큰 값이 자식에 있다는 의미
            swap(arr,greaterIdx,parentIdx);
            makeHeap(arr,greaterIdx,arrSize); // 바꾸고 나서도 하위 트리의 대소관계를 비교해야함
        }
        return arr;
    }
    /** [한번 해보기]while 문 작성 실패.... <- 한 방향으로만 힙을 만듬. 중간 노드 에서 바꾸어 줬을때 그 노드를 루트노드로 다시 아래노드와 비교, 확인이 되어야 하는데
     * 그 부분에서 재귀가 들어가야됨. while을 따로 함수로 만들어 빼도 결국은 하위 부분을 다시 확인해야 하기 때문에 while부분을 재귀 돌려야 함. **/
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
