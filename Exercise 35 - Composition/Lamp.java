public class Lamp {

    private String style;
    private boolean isBattery;
    private  int globalRating;

    public Lamp(String style, boolean isBattery, int globalRating) {
        this.style = style;
        this.isBattery = isBattery;
        this.globalRating = globalRating;
    }

    public  void  turnOn(){
        System.out.println("Lamp is turned on ");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
