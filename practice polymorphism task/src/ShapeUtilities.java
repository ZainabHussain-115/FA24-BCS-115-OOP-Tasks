public class ShapeUtilities {
    public static void shapeCount(Shape[] shapes){
        int circles=0;
        int rectangles=0;
        int spheres=0;
        int cubes=0;

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                rectangles++;

            }
            if (shape instanceof Sphere) {
                spheres++;
            }
            if (shape instanceof Cube) {
                cubes++;
            }
            if (shape instanceof Circle) {
                circles++;
            }
        }
        System.out.println("Circles: "+circles);
        System.out.println("Rectangles: "+rectangles);
        System.out.println("Spheres: "+spheres);
        System.out.println("Cubes: "+cubes);
    }

}
