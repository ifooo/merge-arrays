package merge.arrays;

import java.util.Arrays;

/**
 * Created by ivo.shurbanovski on 8/4/2015.
 */
public class MergeArrays {
    static int[] mergeArrays(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length ){

            if(a[i] < b[j]){
                newArray[k] = a[i];
                i++;
            }else {
                newArray[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length)
        {
            newArray[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            newArray[k] = b[j];
            j++;
            k++;
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] b = {2,4,6,8,10};
        int[] a = {1,3,5,7,9,12,14,16,18,20};
        int[] array = mergeArrays(a,b);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);


    }
}
