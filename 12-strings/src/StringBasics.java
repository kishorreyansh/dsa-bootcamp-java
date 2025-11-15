public class StringBasics {
    public static void main(String[] args) {
        String a = "reyansh";
        String b = "reyansh";
        System.out.println(a == b);

        String name = new String("Ridhansh");
        String name1 = new String("Ridhansh");
        System.out.println(name == name1);

        System.out.println(name.equals(name1));
    }
}
