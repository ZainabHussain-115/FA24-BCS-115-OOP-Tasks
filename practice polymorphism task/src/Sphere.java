public class Sphere extends Shape3D{
    private double radius;
    public Sphere() {
        super();
    }
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4/3)*(Math.PI)*(radius*radius*radius) ;
    }

    @Override
    public double area() {
        return 4*(Math.PI)*(radius*radius);
    }
    public String toString() {
        return String.format("Sphere Area: %.2f \n Sphere Volume: %.2f \n", area(), volume());
    }
}
