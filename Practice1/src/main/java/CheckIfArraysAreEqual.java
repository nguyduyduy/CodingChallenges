import java.util.Arrays;

public class CheckIfArraysAreEqual {
    public static void main(String[] args) {

        int a1[] = {1 ,2 ,3 ,4 ,5, 6};
        int a2[] = {1 ,2 ,3 ,4 ,5};

/*        Approach 1 using Arrays equals
        boolean status = Arrays.equals(a1 , a2);

        if (status == true){
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are not equal");
        } */

        // Approach 2

        boolean status = true;
        if (a1.length == a2.length){
            // compare the elements

            for (int i = 0; i < a1.length; i++){
                if (a1[i] != a2[i]){
                    status = false;
                }
            }
        } else {
            status = false;
        }

        if (status == true){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}