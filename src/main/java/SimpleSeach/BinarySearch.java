package SimpleSeach;

import java.util.Scanner;
/**
3 7
2 5 7
 **/
public class BinarySearch {

    public int binarySearch(int[] nums, int find){
        int middle = nums.length/2;//중간값
        int start = 0;
        int end = nums.length-1;

        while(start <= end){//같은지 비교하기
            if(nums[middle]>find) {
                end = middle-1;//인덱스 옮기기
            }
            else if(nums[middle]<find){
                start = middle+1;//인덱스 옮기기
            }
            else if (nums[middle] == find){
                return middle;
            }

            middle = (end + start)/2;//중간값
        }

        return -2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int find = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums,find)+1);

    }
}
