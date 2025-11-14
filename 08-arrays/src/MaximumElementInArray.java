public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 17, 5};
        System.out.println(maxElement(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    private static int maxElement(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int maxNo = arr[0];
        for(int i=0; i<arr.length;i++){
            if(maxNo < arr[i]){
                maxNo = arr[i];
            }
        }
        return maxNo;
    }

    private static int maxRange(int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i=start; i<=end;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
