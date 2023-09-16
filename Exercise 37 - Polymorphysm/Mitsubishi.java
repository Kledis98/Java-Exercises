public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
        int engine = 1;
        int wheels = 4;

    }

    @Override
    public String startEng() {
        return ("Mitsubishi Engine " + getName());
    }

    @Override
    public String accelerating() {
        return getClass().getSimpleName() + " accelerating";
        }

    @Override
    public String brake() {
        return super.brake();
    }
}
