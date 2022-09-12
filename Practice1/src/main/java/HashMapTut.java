import java.util.HashMap;

public class HashMapTut {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 30;
//        int c = 15;
//
//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a", 10);
//        happy.put("b", 30);
//        happy.put("c", 15);

//        System.out.println(happy);
//        System.out.println(happy.get("c"));


        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("Duy1993","password");
        fun.put("John123", "password123");
        fun.put("Clondike333", "password089");

        System.out.println(fun.clone());
    }
}
