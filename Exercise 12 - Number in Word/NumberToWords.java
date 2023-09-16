public class NumberToWords {
    public static void main(String[] args) {

        numberToWords(1000);
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);
        int digitCount = getDigitCOunt(number);
        while(reversed!=0 || digitCount > 0){
            int lastDigit = reversed % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }

            reversed /= 10;
            digitCount --;
        }

    }

    public static int reverse(int number){
        int reversedVal = 0;
        while (number!=0){
            int lastDigit = number % 10;
            reversedVal *= 10;
            reversedVal += lastDigit;
            number/=10;
        }
        return reversedVal;
    }

    public static int getDigitCOunt(int number){
        if (number < 0 ) return -1;
            if (number == 0 )
                return 1;


        int count = 0;
        while (number != 0){

            count++;
            number/=10;

        }
        return count;
    }
}
