public class ParkingSystem {
    public String campusName;
    Supervisor supervisor;
    ParkingZone[] parkingZone;
    PermitHolder[] permitHolder;
    int zoneCount=0;
    int permitCount=0;

    private ParkingSystem(String campusName, Supervisor supervisor,ParkingZone[] parkingZone, PermitHolder[] permitHolder) {
        this.campusName = campusName;
        this.supervisor = supervisor;
        this.parkingZone = new ParkingZone[10];
        this.permitHolder = new PermitHolder[10];
    }
    public String getCampusName() {
        return campusName;
    }
    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }
    public void addZone(ParkingZone z) {
        if (zoneCount < parkingZone.length) {
            parkingZone[zoneCount++] = z;
        }
    }

    public void addPermitHolder(PermitHolder p) {
        if (permitCount < permitHolder.length) {
            permitHolder[permitCount++] = p;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus: ").append(campusName).append("\n");
        sb.append("Supervisor: \n").append(supervisor.getName()).append("Experience: ").append(supervisor.getYearsOfExperience()).append("\n");
        sb.append("Parking Zones: \n");
        for (int i = 0; i < zoneCount; i++) {
            ParkingZone z = parkingZone[i];
            sb.append("Zone ID: ").append(z.getZoneId()).append("\nVehicles:\n");
            for (int j = 0; j < z.getVehicleCount(); j++) {

                sb.append(z.vehicle[j]).append("\n");
            }
            }
        sb.append("\n");

        sb.append("Permit Holders:\n");
        for (int i = 0; i < permitCount; i++) {
            PermitHolder p = permitHolder[i];
            sb.append("Name: ").append(p.getName()).append("\n Permit ID: ").append(p.getPermitId());
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void getInstance(String campusName, Supervisor supervisor) {

    }
}
