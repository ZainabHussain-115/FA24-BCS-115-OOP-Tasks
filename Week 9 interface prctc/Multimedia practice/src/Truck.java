public class Truck extends FourWheelsVehicle{
    @Override
    public void drive() {
        System.out.println("Truck drive");
    }

    @Override
    public void pause() {
        System.out.println("Truck pause");
    }

    @Override
    public void play() {
        System.out.println("Truck play");
    }
}
