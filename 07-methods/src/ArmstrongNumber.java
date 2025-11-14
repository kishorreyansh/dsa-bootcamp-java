import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean res = isArmstrong(n);
        System.out.println(res);*/

        // Printing all 3 digit Armstrong numbers between 100 to 1000
        for(int i=100; i<= 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while( n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }
        /*if(original == sum){
            return true;
        }
        return false;*/
        return original == sum;
    }
}
