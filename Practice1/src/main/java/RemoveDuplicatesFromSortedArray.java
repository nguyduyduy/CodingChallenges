import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int [] nums){

        int i = 0; // Left pointer
        for (int j = 1; j < nums.length; j++) { // Right pointer scanning array and checking unique values
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums [j]; // nums[++i] = nums [j]

            }
        }

        return i+1;


    }

    public static void main(String[] args) {
        int [] a = new int[]{1, 1, 2, 3, 4, 4, 4, 5, 6, 6};

        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));


    }
}
