public class Main {
    public static void main(String[] args) {
        printEqual(1,2,3);
    }
    public static void printEqual(int a, int b, int c ){
        if (a < 0 || b < 0 || c < 0 ){
            System.out.println("Invalid value");
        }
        else if (a == b && a == c){
            System.out.println("Equal");
        }
        else if (a!=b && a!=c && a!=c){
            System.out.println("Different");
        }
        else {
            System.out.println("Neither equal or different");
        }
    }
}
