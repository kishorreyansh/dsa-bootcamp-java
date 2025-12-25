import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean armstrong = isArmstrong(n);
        if(armstrong){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }

        // Printing all armstrong numbers of 3 digits
        System.out.println("Printing all armstrong numbers of 3 digits");
        for(int i=100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int no){
        int original = no;
        /*int digits = String.valueOf(no).length();
        sum += Math.pow(rem,digits);*/
        int sum = 0;
        int cube;
        while(no > 0){
            int rem = no % 10;
            cube = rem * rem * rem;
            sum += cube;
            no = no / 10;
        }
        if(original == sum){
            return true;
        }else{
            return false;
        }





    }
}
