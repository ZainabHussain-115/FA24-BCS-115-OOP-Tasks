public class Rectangle extends Shape2D{
    private double length;
    private double width;
    public double perimeter(){
        return length + width;
    }
    public Rectangle(){
        super();
    }
    @Override
    public double area(){
        return length * width;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
            this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public String toString() {
        return String.format("Rectangle Area: %.2f \n Rectangle Circumference: %.2f \n", area(), perimeter());
    }
}
