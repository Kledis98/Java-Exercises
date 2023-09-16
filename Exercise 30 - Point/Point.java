public class Point {

    private int x;
    private  int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance(int x1, int y1){
       return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
    }
    public double distance(Point point){
        return Math.sqrt((x-point.x)*(x- point.x) + (y- point.y)*(y- point.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
