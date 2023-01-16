package characters;

import java.util.Objects;

public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(name, ((Character) o).getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
