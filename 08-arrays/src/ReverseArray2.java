import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {23,1,3,8,2,6,5,17};
        //swap(arr,1,2);
        //System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
