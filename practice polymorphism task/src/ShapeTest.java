public class ShapeTest {

    public static void main(String[] args) {
        Shape shape1;
        Shape2D shape2d;
        Shape3D shape3d;
        Circle circle1=new Circle();
        circle1.setRadius(10);

        Rectangle rectangle1=new Rectangle();
        rectangle1.setLength(2);
        rectangle1.setWidth(3);
        Sphere sphere1=new Sphere();
        sphere1.setRadius(10);
        Cube cube1=new Cube();
        cube1.setSide(2);

        System.out.println("\nArea of Circle: "+circle1.area());
        System.out.println("\nCircumference of Circle: "+circle1.circumference());
        System.out.println("\nArea of Rectangle: "+rectangle1.area());
        System.out.println("\nPerimeter of Rectangle: "+ rectangle1.perimeter());
        System.out.println("\nArea of Sphere: "+sphere1.area());
        System.out.println("\nVolume of Sphere: "+sphere1.volume());
        System.out.println("\nArea of Cube: "+cube1.area());
        System.out.println("\nVolume of Cube: "+cube1.volume());

        Shape shapes[]=new Shape[20];
        shapes[0]=new Circle(2);
        shapes[1]=new Rectangle(2,2);
        shapes[2]=new Sphere(3);
        shapes[3]=new Cube(3);
        shapes[4]=new Circle(22);
        shapes[5]=new Rectangle(3,4);
        shapes[6]=new Sphere(5);
        shapes[7]=new Cube(4);
        shapes[8]=new Rectangle(6,7);
        shapes[9]=new Sphere(6);
        shapes[10]=new Cube(10);
        shapes[11]=new Rectangle(1,1);
        shapes[12]=new Sphere(8);
        shapes[13]=new Cube(9);
        shapes[14]=new Circle(12);
        shapes[15]=new Rectangle(2,98);
        shapes[16]=new Sphere(4);
        shapes[17]=new Cube(5);
        shapes[18]=new Rectangle(4,4);
        shapes[19]=new Sphere(6);

        for(int i=0;i< shapes.length;i++){
            System.out.println("\nAREA:"+shapes[i].area());
        }
        for (Shape shape : shapes) {
            System.out.println(shape);

        }
        //setting rectangles lenghts

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                double k=5;
                ((Rectangle) shapes[i]).setLength(k);
                k+=5;
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println(shape);
            }
        }
        ShapeUtilities su=new ShapeUtilities();
        su.shapeCount(shapes);



    }
}
