public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super(14.54,"DELUXE", "Chicken", "Rolled");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);

        //items are added in constructor

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("NO additional items can be added to the DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("NO additional items can be added to the DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("NO additional items can be added to the DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("NO additional items can be added to the DeluxeBurger");
    }
}
