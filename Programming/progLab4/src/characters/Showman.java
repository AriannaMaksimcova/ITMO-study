package characters;

import exceptions.UnsuitableFormatException;
import interfaces.TVStudioWorkerAction;

import java.util.Objects;

public class Showman extends Person implements TVStudioWorkerAction {
    private double salary = 0.0;
    public Showman(String name) {
        super(name);
    }
    @Override
    public boolean isAgreeWithConditions(OwnerActionOfTVStudio character, double need, double suggested){
        if (suggested >= need){
            this.toSay(character + " выполнил все наши условия. Теперь мы сделаем всё, что он хочет");
            return true;
        } else {
            this.toSay("Мы не согласны с условиями " + character);
            return false;
        }
    }
    @Override
    public double putForwardConditions(Showman withWho, Person toWhom, String what){
        if(toWhom.getClass() != OwnerActionOfTVStudio.class){
            throw new UnsuitableFormatException("Неподходящий формат героя: " + toWhom);
        }
        toSay("Мы с " + withWho + " несогласны с условиями " + toWhom + ". " + what);
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
