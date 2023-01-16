package characters;

public class Doctor extends Person{
    private boolean isAdvertised;
    public Doctor(String name, boolean isAdvertised) {
        super(name);
        this.isAdvertised = isAdvertised;
    }
    public boolean isAdvertised() {
        return isAdvertised;
    }
    public void treatThePatient(Person person){
        person.setHealthy(true);
    }
}
