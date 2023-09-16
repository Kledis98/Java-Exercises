public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(707));
    }
    public  static  boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number; // store the original number before any changes made

        while (number !=0 ){
           reverse *=10;
           reverse += number%10;
           number /=10;

        }
        if (temp == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
