public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Rectangle area is : " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid area :  " + cuboid.getArea());
        System.out.println(" Cuboid volume "  + cuboid.getVolume());
    }
}
