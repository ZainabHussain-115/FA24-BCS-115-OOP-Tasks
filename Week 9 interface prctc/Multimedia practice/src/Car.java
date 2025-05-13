public class Car extends FourWheelsVehicle{
    @Override
    public void drive() {
        System.out.println("Car drive");
    }

    @Override
    public void pause() {
        System.out.println("Car pause");
    }

    @Override
    public void play() {
        System.out.println("Car play");
    }
}
