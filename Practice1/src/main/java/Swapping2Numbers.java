public class Swapping2Numbers {

    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println("Before swapping values are... " + a + " " + b);

        // LOGIC 1 - Using a third variable
        // We first assign t to 10. We then assign a to 20. Last we assign b to 10 from t.
        int t = a;
//        System.out.println(t); = 10
//        System.out.println(a); = 10
        a = b;
//        System.out.println(a); = 20
//        System.out.println(b); = 20
        b = t;
//        System.out.println(b); = 10
//        System.out.println(t); = 10

        System.out.println("After swapping values are.. " + a + " " + b);

    }
}
