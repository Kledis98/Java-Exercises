public class Main {
    public static void main(String[] args) {


        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling  = new Ceiling(12, 15);

        Lamp lamp = new Lamp("New" , true, 5);

        Bed bed  = new Bed("Modern", 6,9,15,1);
        Bedroom bedroom = new Bedroom("Best Room ", wall1,wall2,wall3,wall4,ceiling,bed,lamp );
        bedroom.makeBed();
                bedroom.getLamp().turnOn();
    }
}
