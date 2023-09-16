import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] firstArray = new int[] {2,5,7,8,9};


        reverse(firstArray);

    }

    public static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int temp;
        for (int i = 0 ; i< array.length/2; i++){ // divided by two, we just need the half of the array and the other half will be sorted
            temp = array[i];
            array[i] = array[array.length-(1+i)];
            array[array.length-(1+i)] = temp;

        }
        System.out.println("Reverser array is " + Arrays.toString(array));

    }
    }

