public class ReverseString {
    public static void main(String[] args) {
        String r = reverse(4,"dawn");
        System.out.println(r);
    }

    public static String reverse(int N, String s){

        String reverse = "";
        char[] letters = new char[s.length()];

        int indexLetters = 0;
        for(int i = s.length()-1; i >= 0; i--){
            letters[indexLetters] = s.charAt(i);
            System.out.println(s.charAt(i));
            indexLetters++;
            System.out.println(indexLetters);
        }

        for (int i = 0; i < s.length(); i++){
            reverse += letters[i];
        }
        return reverse;

    }
}
