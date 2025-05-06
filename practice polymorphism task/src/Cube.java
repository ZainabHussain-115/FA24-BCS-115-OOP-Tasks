public class Cube extends Shape3D{
    private double side;
    public Cube(){
        super();
    }

    public Cube(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return (side * side*side);
    }

    @Override
    public double area() {
        return (side * side);
    }
    public String toString() {
        return String.format("Cube Area: %.2f \n Cube Volume: %.2f \n", area(), volume());
    }
}
