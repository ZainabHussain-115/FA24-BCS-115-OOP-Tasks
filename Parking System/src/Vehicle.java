public class Vehicle {
    String licensePlate;
    String type;
    Owner owner;
    public Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }
    public Vehicle shallowCopy() {
        return new Vehicle(this.licensePlate, this.type, this.owner);
    }

    public Vehicle deepCopy() {
        return new Vehicle(this.licensePlate, this.type, new Owner(owner.getName()));
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
