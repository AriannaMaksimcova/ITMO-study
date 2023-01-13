package characters;

import enums.Performance;
import interfaces.TVStudioWorker;

import java.util.Objects;

public class Showman extends Person implements TVStudioWorker {
    private double salary = 0.0;
    public Showman(String name) {
        super(name);
    }
    @Override
    public boolean isAgreeWithConditions(OwnerOfTVStudio character, double need, double suggested){
        if (suggested >= need){
            this.toSay(character + " выполнил все наши условия. Теперь мы сделаем всё, что он хочет");
            return true;
        } else {
            this.toSay("Мы не согласны с условиями " + character);
            return false;
        }
    }
    @Override
    public double putForwardConditions(Showman withWho, OwnerOfTVStudio toWhom){
        toSay("Мы с " + withWho + " несогласны с условиями " + toWhom + ". Он хочет, чтобы мы показывали " +
                Performance.DUNNO_ON_THE_MOON + " почти бесплатно!\nОчевидно, " + toWhom + " принимает нас за " +
                "слабоумных, в то время как мы вполне в своём уме и за такую ничтожную сумму\nне согласились" +
                " бы показывать по телевидению не то что пришельца из космоса, но даже простого пуделя");
        return Math.random() * 1000;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Showman showman = (Showman) o;
        return Double.compare(showman.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }
}
