package SimpleSeach;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int middle = nums.length/2;//중간값
        int start = 0;
        int end = nums.length-1;
        while(nums[middle] != find){//같은지 비교하기
            if(nums[middle]>find) {
                end = middle;//인덱스 옮기기
            }
            else{
                start = middle;//인덱스 옮기기
            }
            middle = (end + start)/2;//중간값
        }
        System.out.println(middle);





    }
}
