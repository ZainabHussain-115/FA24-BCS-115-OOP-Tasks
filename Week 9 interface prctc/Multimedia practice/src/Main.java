public class Main {
    public static void main(String[] args) {
        Vehicle vehicles[]= new Vehicle[5];
        vehicles[0]=new Car();
        vehicles[1]=new Truck();
        vehicles[2]=new Truck();
        vehicles[3]=new Bike();
        vehicles[4]=new Car();

        MultiMedia media=new MultiMedia() {
            @Override
            public void play() {
                System.out.println("Playing media");
            }

            @Override
            public void pause() {
                System.out.println("Pausing media");
            }
        };


        processVehicle(vehicles);
        processPrintable(vehicles);

        Doable doable=()->System.out.println("Doing it!");
        doable.doIt();

        ProcessingVehicle processingVehicle=(vehicle)->{
            for(Vehicle v:vehicles){
                v.drive();
            }
        };


    }
    //play method call giving array
    public static void processVehicle(Vehicle[] vehicle) {
        //call interface play use loop
        for(int i=0; i<vehicle.length; i++) {
            vehicle[i].play();
        }


    }
    public static void processPrintable(Vehicle[] vehicle) {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] instanceof TwoWheelsVehicle){
                ((TwoWheelsVehicle)vehicle[i]).print("Printing!");
            }

        }
    }
}
