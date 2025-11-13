import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the Operator:");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the Numbers:");
                int no1 = sc.nextInt();
                int no2 = sc.nextInt();

                if(op == '+'){
                    ans = no1 + no2;
                }

                if(op == '-'){
                    ans = no1 - no2;
                }

                if(op == '*'){
                    ans = no1 * no2;
                }

                if(op == '/'){
                    if(no2 != 0){
                        ans = no1 / no2;
                    }
                }

                if(op == '%'){
                    ans = no1 % no2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Number");
            }
            System.out.println(ans);
        }
    }
}
