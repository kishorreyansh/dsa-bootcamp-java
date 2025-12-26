import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(17);
        al.add(23);
        al.add(15);

        System.out.println(al);

        al.set(2,5);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
    }
}
