public class Main {
    public static void main(String[] args) {


        Car car = new Car(4,"Base Car");
        System.out.println(car.startEng());


        Mitsubishi mitsubishi = new Mitsubishi(6,"Subaru");
        System.out.println(mitsubishi.startEng());
        System.out.println(mitsubishi.accelerating());

    }
}
