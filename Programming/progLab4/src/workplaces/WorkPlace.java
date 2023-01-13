package workplaces;

import characters.Person;

import java.util.Objects;

public abstract class WorkPlace <T extends Person, V extends Person>{
    T boss;
    V[] workers;
    private String name;
    public WorkPlace(String name, T boss, V[] workers){
        this.name = name;
        this.boss = boss;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkPlace workPlace = (WorkPlace) o;
        return Objects.equals(name, workPlace.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
