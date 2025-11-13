public class ReverseNumber {
    public static void main(String[] args) {
        int num = 170420;
        String ans = " ";
        while( num > 0){
            int rem = num % 10;
            num = num / 10;
            ans = ans  + rem;
            //ans = ans * 10  + rem; //if ans is int
        }
        System.out.println(ans);
    }
}
