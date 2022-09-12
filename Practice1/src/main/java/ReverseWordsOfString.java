public class ReverseWordsOfString {
    public static void main(String[] args) {
        String str = "how can you say that";

        String a[] = str.split(" "); // Creating an array of strings and then using the
        // split() method to break up the string by spaces " " and returns an array where it is split 

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = a.length -1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }


    }
}
