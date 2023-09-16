import java.nio.file.Path;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour <  0){
            return -1;
        }
        else{
            long calculation = Math.round(kilometersPerHour/1.6);
            return calculation;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if ( kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour/1.6) + " mi/h");
        }
    }
}
