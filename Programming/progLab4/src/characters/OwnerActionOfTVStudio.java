package characters;

import interfaces.TVStudioBossAction;

import java.util.Objects;

public class OwnerActionOfTVStudio extends Person implements TVStudioBossAction {
    private double salary = 0.0;
    public OwnerActionOfTVStudio(String name) {
        super(name);
    }
    @Override
    public void agreeWithConditions(Person character){
        if (this.isWasThreatened()){
            this.toSay("Угрозы подействовали. Я согласен с условиями, которые предложил " + character.toString());
        }
    }
    @Override
    public void assignSalary(Showman whom, double amount){
        whom.setSalary(amount);
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OwnerActionOfTVStudio that = (OwnerActionOfTVStudio) o;
        return Double.compare(that.salary, salary) == 0 && wasThreatened == that.wasThreatened;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, wasThreatened);
    }
}
