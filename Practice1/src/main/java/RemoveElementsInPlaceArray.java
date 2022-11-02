import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElementsInPlaceArray {
    public static int removeElement(int[] nums, int val){
        int index = 0;
        for (int i: nums) { // same as for (int i = 0; i < nums.length; i++)
            if(i != val) {
                nums [index++] = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] a = new int[] {1, 2, 3, 3, 4, 5, 6};
        int b = 3;

        System.out.println(removeElement(a, b));
        System.out.println(Arrays.toString(a));

    }
}
