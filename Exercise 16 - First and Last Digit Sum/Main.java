public class Main {
    public static void main(String[] args) {
        int result = sumFirstAndLastNumber(254);
        System.out.println(result);
    }

    public  static  int sumFirstAndLastNumber(int number){
        if (number < 0){
            return -1;
        }
            int sum = number%10;
            while(number >=10){ //10 because we do not need the remainder of the first digit
                number /=10;
            }
            sum += number;
            return sum;
        }
    }

