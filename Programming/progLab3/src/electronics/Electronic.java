package electronics;

import interfaces.OnOffSwitchable;

import java.util.Objects;

public abstract class Electronic implements OnOffSwitchable {
    private String type;
    private boolean isTurnedOn = false;
    public Electronic(String type){
        this.type = type;
    }
    @Override
    public void turnOn() {
        isTurnedOn = true;
    }
    @Override
    public void turnOff(){
        isTurnedOn = false;
    }
    public boolean isTurnedOn() {
        return isTurnedOn;
    }
    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronic that = (Electronic) o;
        return isTurnedOn == that.isTurnedOn && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, isTurnedOn);
    }
}
