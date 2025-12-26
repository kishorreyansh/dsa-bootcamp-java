public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {17,5,23,28,13};
        System.out.println("Max Element: "+max(arr));
        System.out.println("Max Range: "+maxRange(arr,0,1));
    }

    static int max(int[] arr){
        if(arr.length == 0){
            return  -1;
        }
        int maxEle = arr[0];   //17
        for(int i=1; i<arr.length;i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        return maxEle;
    }

    static  int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i=start; i<= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
