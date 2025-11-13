import java.util.Scanner;

public class SwitchProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fruit:");
        String fruits = sc.next();
        /*switch (fruits){
            case "Apple":
                System.out.println("Red Color");
                break;
            case "Mango":
                System.out.println("Yellow Color");
                break;
            case "Grapes":
                System.out.println("Green Color");
                break;
            default:
                System.out.println("No Color");
        }*/

        switch (fruits) {
            case "Apple" -> System.out.println("Red Color");
            case "Mango" -> System.out.println("Yellow Color");
            case "Grapes" -> System.out.println("Green Color");
            default -> System.out.println("No Color");
        }

        System.out.print("Enter the Day:");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
