public class Bike extends TwoWheelsVehicle{
    @Override
    public void drive() {
        System.out.println("Bike driving");
    }

    @Override
    public void play() {
        System.out.println("Bike playing");
    }

    @Override
    public void pause() {
        System.out.println("Bike pause");
    }

    @Override
    public void parkingMethod() {
        System.out.println("Bike parking");
    }

    @Override
    public void doIt() {
        System.out.println("Bike do it");
    }

    @Override
    public void print(String s) {
        System.out.println("Bike print: " + s);
    }
}
