public class WallArea {
    private double width;
    private double height;

    public WallArea(){
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
    public WallArea(double width, double height){
        if (width < 0 ){
            width =0;
        }
        if (height < 0){
            height =0;
        }
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
            this.height = height;

    }
}
