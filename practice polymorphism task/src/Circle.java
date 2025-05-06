public class Circle extends Shape2D{
    private double radius;
    public Circle() {
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
  public double circumference() {
        return 2 * Math.PI * radius;
  }

    @Override
    public double area() {
        return (Math.PI)*(radius * radius);
    }

    @Override
    public String toString() {
      return String.format("Circle Area: %.2f \n Circle Circumference: %.2f \n", area(), circumference());
    }
}
