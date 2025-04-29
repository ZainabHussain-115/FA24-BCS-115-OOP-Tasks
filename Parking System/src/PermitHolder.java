public class PermitHolder extends Person {
    private int permitId;

    public PermitHolder(String name) {
        super(name);
    }
    public int getPermitId() {
        return permitId;
    }
    public void setPermitId(int permitId) {
        this.permitId = permitId;
    }
}
