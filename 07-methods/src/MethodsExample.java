public class MethodsExample {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name = "Kohli";
        System.out.println("Outside block a value: "+a);

        {
            a=20;
            System.out.println("inside block a value: "+a);
            int c = 30;
            System.out.println("inside block c value: "+c);
            name = "Virat";
            System.out.println("inside block name value: "+name);
        }
        int c = 40;
        System.out.println("outside block c value: "+c);
        a= 50;
        System.out.println("Outside block end a value: "+a);
        name="Kishor";
        System.out.println("outside block end name value: "+name);

    }
}
