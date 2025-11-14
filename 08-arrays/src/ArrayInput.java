import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        rollno[0] = 1;
        rollno[1] = 2;
        rollno[2] = 3;
        rollno[3] = 4;
        rollno[4] = 5;

        for(int i = 0; i <rollno.length; i++){
            System.out.print(rollno[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Enhanced For Loop");
        for(int num: rollno){
            System.out.print(num + " ");
        }

        System.out.println(" ");
        System.out.println("Best Way to Print For Loop");
        System.out.print(Arrays.toString(rollno) + " ");

        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];
        for(int i=0; i< names.length; i++){
            names[i] = sc.next();
        }
        for(String name: names){
            System.out.print(name + " ");
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(names) + " ");

    }
}
