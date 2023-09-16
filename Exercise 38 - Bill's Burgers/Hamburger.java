public class Hamburger {

    private double price;
    private String name;
    private String meat;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(double price, String name, String meat, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price = price;
            }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price =price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " which is the basic hamburger costs " + this.price);

        if (this.addition1Name != null){
            hamburgerPrice+=addition1Price;
            System.out.println("Added " + this.addition1Name + " for a cost of " + this.addition1Price);        }
        if (addition2Name != null){
            hamburgerPrice+=addition2Price;
            System.out.println(addition2Name + " is added to the basic hamburger and the total cost is " + addition2Price );
        }
        if (addition3Name != null){
            hamburgerPrice+=addition3Price;
            System.out.println(addition3Name + " is added to the basic hamburger and the total cost is " + addition3Price );
        }
        if (addition4Name != null){
            hamburgerPrice+=addition4Price;
            System.out.println(this.name + " is added to the basic hamburger and the total cost is " + addition4Price );
        }
        return hamburgerPrice;

    }



}
