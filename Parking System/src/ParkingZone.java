public class ParkingZone {
    String zoneId;
    private static int zoneCounter = 1;
    private int vehicleCount = 0;
    Vehicle[] vehicle=new Vehicle[5];

    public ParkingZone() {
        this.zoneId = "Z" + zoneCounter++;
        this.vehicle = new Vehicle[5];
    }

    public void addVehicle(Vehicle vehicle1) {
        if (vehicleCount < 5) {
            vehicle[vehicleCount++] = vehicle1;
        }
    }

    public String getZoneId() {
        return zoneId;
    }
    public int getVehicleCount() {
        return vehicleCount;
    }

}
