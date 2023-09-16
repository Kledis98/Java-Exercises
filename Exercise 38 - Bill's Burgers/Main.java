public class Main {
    public static void main(String[] args) {


        Hamburger hamburger= new Hamburger(3.5,"Basic", "Sausgae", "White");
        hamburger.addHamburgerAddition1("Tomato", 1.5);
        hamburger.addHamburgerAddition3("Cheese", 2.5 );

        System.out.println("Total cost is : " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger  = new HealthyBurger(2.5,"Chicken");
        healthyBurger.addHealthyAddition1("Egg", 1.2);
        healthyBurger.addHealthyAddition2("Lentils", 1.0);
        System.out.println( "Total cost is " +  healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Should not do this " , 5.2);
        System.out.println( "Total cost is "  +  deluxeBurger.itemizeHamburger());
        }
}
