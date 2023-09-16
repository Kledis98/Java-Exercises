public class Main {
    public static void main(String[] args) {
        printYearsAndDays(1051525);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ){
            System.out.println("Invalid Value");
        }
        long hours = minutes/60;
        long days = hours/24;
        long years = days/365;
        long remaindedDays = days % 365;

        System.out.println(minutes + " min = " + years + "y "  + remaindedDays + "D ");
    }


}
