public class CountNumbers {
    public static void main(String[] args) {
        int num = 92083490;
        int count = 0;
        while( num > 0){
            int rem = num % 10; //last digit
            if(rem == 8){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
