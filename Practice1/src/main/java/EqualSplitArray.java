import java.util.*;
import java.io.*;
import java.lang.Math;

public class EqualSplitArray
{
    public static int equalSplitArray(int N,int [] A)
    {

        int leftArray = 0;

        for (int i = 0; i < N; i++){

            leftArray += A[i];
            System.out.println(leftArray);

        }

        int rightArray = 0;

        for (int i = N - 1; i >= 0; i--){

            rightArray += A[i];
//            System.out.println(rightArray);

            return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        int []A = {1, 2, 3, 4, 5};
        int N = A.length;
        System.out.println(N);
        System.out.println(equalSplitArray(N, A));
    }

}