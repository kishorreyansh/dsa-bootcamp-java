import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 17, 5, 23, 13};
        reverseArray(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        for(int i=start; i<= end; i++){
            swapArr(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swapArr(int[] arr,int index1, int index2) {
        for(int i=0; i<arr.length;i++){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}
