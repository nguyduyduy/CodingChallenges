public class ReverseString {
    public static void main(String[] args) {
        String s = "mom";
        int N = s.length();
        System.out.println(reverse(N, s));
    }

    public static String reverse(int N, String s){

        String reverse = ""; // Creating an empty string that we will insert our reversed strings into

        char[] letters = new char[s.length()]; // Creating an array of chars of String s, in this case "dog" or
        // whatever size of the string

        int indexLetters = 0; // Initializing index for each char of letters array

        for(int i = s.length()-1; i >= 0; i--){ // int i is starting at end of String s ("dog"), i will keep looping until it reaches 0
            // i will then decrement once letters[letterIndex] is assigned the char

            letters[indexLetters] = s.charAt(i); // Here we are saying that the index in the letters array is equal to the
            // char at index of i

//            System.out.println(s.charAt(i));

            indexLetters++; // letterIndex will increment after assignment (0...1..2...)

//            System.out.println(indexLetters);
        }

        for (int i = 0; i < s.length(); i++){
            reverse += letters[i]; // Creating a for loop for the empty string of 'reverse'
            // It will look insert the chars of the letters array at the index into the empty string of 'reverse'
        }
        return reverse;

    }
}
