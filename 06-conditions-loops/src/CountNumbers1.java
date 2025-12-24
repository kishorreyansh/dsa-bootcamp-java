public class CountNumbers1 {
    public static void main(String[] args) {
        int no = 13433;
        int n = 3;
        int count = 0;
        while( no > 0){
            int ld = no % 10;
            if(ld == n){
                count++;
            }
            no = no / 10;
        }
        System.out.println(count);
    }
}
