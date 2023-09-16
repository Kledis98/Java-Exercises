public class TeenNumber {
    public static boolean hasTeen(int a, int b, int c){
        if ( (a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19) ){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num1){
        if (num1 >= 13 && num1 <=19 ){
            return true;
        }
        return false;
    }
}
