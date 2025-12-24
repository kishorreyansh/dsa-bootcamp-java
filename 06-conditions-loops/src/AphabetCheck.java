import java.util.Scanner;

public class AphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch > 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        }else{
            System.out.println("Lower Case");
        }
    }
}
