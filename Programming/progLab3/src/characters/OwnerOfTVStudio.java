package characters;

import interfaces.Boss;

import java.util.Objects;

public class OwnerOfTVStudio extends Person implements Boss {
    private double salary = 0.0;

    private boolean wasThreatened = false;
    public OwnerOfTVStudio(String name) {
        super(name);
    }
    @Override
    public void agreeWithConditions(Showman character){
        if (wasThreatened){
            this.toSay("Угрозы подействовали. Я согласен с условиями, которые предложил " + character.toString());
        }
    }
    @Override
    public void assignSalary(Showman whom, double amount){
        whom.setSalary(amount);
    }
    public boolean isWasThreatened() {
        return wasThreatened;
    }

    public void setWasThreatened(boolean wasThreatened) {
        this.wasThreatened = wasThreatened;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OwnerOfTVStudio that = (OwnerOfTVStudio) o;
        return Double.compare(that.salary, salary) == 0 && wasThreatened == that.wasThreatened;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, wasThreatened);
    }
}
