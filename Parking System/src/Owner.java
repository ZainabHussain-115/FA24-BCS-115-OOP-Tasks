public class Owner extends Person {
    private static int counter = 1;
    private String ownerId;

    public Owner(String name) {
        super(name);
        this.ownerId = String.format("%d", counter++);
    }

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
