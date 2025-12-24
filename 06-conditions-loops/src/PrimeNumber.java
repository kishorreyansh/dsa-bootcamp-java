public class PrimeNumber {
    public static void main(String[] args) {
        int number = 5;
        int c =2;
        if( number <= 1){
            System.out.println("Not a Prime Number");
        }else{
            boolean isPrime = true;
            while( c*c <= number){
                if( number % c == 0){
                    isPrime = false;
                }
                c = c+1;
            }
            if(isPrime){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime Number");
            }

        }
    }
}
