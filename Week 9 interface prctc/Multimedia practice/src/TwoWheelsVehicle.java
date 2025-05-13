public abstract class TwoWheelsVehicle extends Vehicle implements Printable,Doable {
    public abstract void parkingMethod();
    Printable printable=new Printable() {
        @Override
        public void print(String s) {
            System.out.println(s);
        }
    };
}
