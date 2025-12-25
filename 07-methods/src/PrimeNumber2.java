import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = prime(n);
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }

    static boolean prime(int number){
        // 1,2,3,5,7,11
        int c = 2;
        if(number <= 1){
            return false;
        }
        while(c*c <= number){
            if(number%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
