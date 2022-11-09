package selectionSort;

public class SelectionSort {

    public int findMin(int[] arr){
        int index = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,7,72,9,10,223,111,23,7,4,39};
        SelectionSort ss = new SelectionSort();
        System.out.println(ss.findMin(arr));

    }
}
