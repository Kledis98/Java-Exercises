import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int number = readInteger();
        int[] array =  readElements(number);
        System.out.println(findMin(array));
  }
    private static int readInteger(){
        System.out.println("Enter the number of elements you will enter ");
        int number = scanner.nextInt();
        return number;
    }

    private static int[] readElements(int number){
        System.out.println("Enter the nr of elements which is " + number);
        int[] myArray = new int[number];
        for (int i = 0 ; i<myArray.length; i++){
           myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] array){
        int minimumValue =0;
        for (int i =0; i<array.length-1; i++){

            if (array[i] < array[i+1]){
                minimumValue = array[i];
             }

        }
        return minimumValue;
    }
}
