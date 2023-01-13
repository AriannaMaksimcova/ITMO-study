package characters;

import electronics.Phone;
import electronics.Television;
import enums.Performance;
import interfaces.CanTalk;
import interfaces.Emotional;
import interfaces.UsePhone;
import interfaces.UseTelevision;

import java.util.Objects;

public class Person extends Character implements Emotional, UsePhone, UseTelevision, CanTalk {
    private String emotion = "Neutral";
    private double stateOfPatience = 0;
    private Television TV;
    private Phone phone;
    public Person(String name) {
        super(name);
    }
    public Person(String name, Television TV, Phone phone){
        super(name);
        this.TV = TV;
        this.phone = phone;

    }
    @Override
    public void getAngry(){
        emotion = "Angry";
        System.out.println(this + " get Angry!");
    }
    @Override
    public void getAngryAt(OwnerOfTVStudio character){
        System.out.println(this + " got angry at " + character);
    }

    @Override
    public void beSurprised() {
        emotion = "Surprised";
        System.out.println(this + " is/are Surprised.");
    }
    @Override
    public void beSurprised(String reason){
        emotion = "Surprised";
        System.out.println(this + " is/are Surprised, because " + reason);
    }

    @Override
    public void toBeAfraid(){
        emotion = "Afraid";
        System.out.println(this + "is/are Afraid.");
    }
    @Override
    public void toBeAfraid(Performance performance) {
        emotion = "Afraid";
        System.out.println(this + " is/are Afraid to miss a performance " + performance);
    }
    @Override
    public void watchTV(Television TV){
        System.out.println(this + " watch/watches TV.");
        TV.turnOn();
        TV.turnOff();
    }
    @Override
    public void toSay(String string){
        System.out.println(this + " say/says: \"" + string + "\".");
    }
    @Override
    public void toAsk(String what, Person who){
        System.out.println(this + " ask/asks "+ who + ": \"" + what + "\"");
    }
    @Override
    public void callByPhone(Phone phone, Person character){
        phone.turnOn();
        System.out.println(this + " call/calls by phone.");
        phone.makeCall(character);
        phone.turnOff();
    }
    public void toThreaten(OwnerOfTVStudio character){
        System.out.println(this + " threaten/threatens " + character.toString() + ".");
        this.toSay("Мы прекратим выплату взносов за пользование телевизорами, если вы не покажете " +
                "нам Незнайку!");
        character.setWasThreatened(true);

    }
    public double getStateOfPatience() {
        return stateOfPatience;
    }

    public void setStateOfPatience(double stateOfPatience) {
        this.stateOfPatience = stateOfPatience;
    }
    public String getEmotion() {
        return emotion;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person object = (Person) obj;
        return (Objects.equals(this.getName(), object.getName())) && (Objects.equals(this.getEmotion(), object.getEmotion()))
                && (this.getStateOfPatience() == object.getStateOfPatience());
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        int result = getName() == null ? 0: getName().hashCode();
        result += getEmotion() == null ? 0: getEmotion().hashCode();
        return result;
    }
}
