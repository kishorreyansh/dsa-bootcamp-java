import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Printing N Numbers");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int no = 1;
        while(no <=5){
            System.out.print(no + " ");
            no++;
        }
    }
}
