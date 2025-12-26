import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization
        for(int row=0; row<3;row++){
            list.add(new ArrayList<>());
        }

        //Adding the Elements
        for(int row=0; row<3;row++){
            for(int col=0; col<3; col++){
                list.get(row).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
