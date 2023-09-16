public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(5);
        System.out.println("circle radius is " + circle.getRadius());
        System.out.println("circle area is " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("cylinder area is " + cylinder.getArea());
        System.out.println("cylinder volume is " + cylinder.getVolume());
    }
}
