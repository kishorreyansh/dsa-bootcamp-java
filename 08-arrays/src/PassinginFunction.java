import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6};
        System.out.println("Before : "+Arrays.toString(nums));
        pass(nums);
        System.out.println("After Calling Function: "+Arrays.toString(nums));
    }

    static void pass(int[] arr){
        arr[0] = 17;
        System.out.println("Inside Function: "+Arrays.toString(arr));
    }
}
