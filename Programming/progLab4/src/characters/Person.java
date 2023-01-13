package characters;

import electronics.Phone;
import electronics.Television;
import enums.Performance;
import interfaces.*;
import workplaces.FoodFactory;

import java.util.Arrays;
import java.util.Objects;

public class Person extends Character implements Emotional, UsePhone, UseTelevision, CanTalk {
    private String emotion = "Neutral";
    boolean wasThreatened = false;
    private double stateOfPatience = 0;
    private boolean isHealthy = true;
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
    public void toBuy(String what, FoodFactory foodFactory, FoodFactory.FoodShop where){
        String[] goods = foodFactory.getProducedFood();
        Arrays.sort(goods);
        if (Arrays.binarySearch(goods, what) > 0) {
            if(foodFactory.isPrintAdsInNewspapers()){
                this.toSay("Я читал про товары этого магазина в газете, поэтому я могу здесь купить " + what);
                if(where.usesAdvertisementsOnTheWall){
                    this.toSay("Я увидил на стене ловко составленное рекламное объявление. Там рекламируются " +
                            where.advertisementsOnTheWall.getWhatToAdvertise() + ". Я хочу купить это, " +
                            "даже если оно мне вовсе не нужно.");
                }
            }
        } else {
            System.out.println(what + " не продается в этом магазине.");
        }
    }
    public void toBeTreatedByDoctor(Doctor doctor){
        if (doctor.isAdvertised()){
            this.toSay(doctor.toString() + " придумал головоломную рекламу для привлечения больных. Я буду у " +
                    "него лечиться.");
        }
    }
    public void toEat(FoodFactory foodFactory){
        if(foodFactory.isPrintAdsInNewspapers()){
            this.toSay("Эта " + foodFactory.toString() + " печатает рекламу в газетах, поэтому " +
                    "я буду есть их " + Arrays.toString(foodFactory.getProducedFood()));
        }
    }
    @Override
    public void getAngry(){
        emotion = "Angry";
        System.out.println(this + " get Angry!");
    }
    @Override
    public void getScared(){
        emotion = "Scary";
        System.out.println(this + " is Scared!");
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
    public void toThreaten(Person character, String whatToSay){
        System.out.println(this + " threaten/threatens " + character.toString() + ".");
        this.toSay(whatToSay);
        character.setWasThreatened(true);

    }
    public void toAwake(){
        System.out.println(this.toString() + " woke up.");
        this.toWant("to know news about Dunno.");
        this.toReadNewspaper();
    }

    public void toWant(String s) {
        System.out.println(this + " want " + s);
    }
    public void toGo(Location location){
        System.out.println(this + " go to " + location);
    }


    public void toReadNewspaper() {
        class Newspaper{
            String name = "Newspaper";
            @Override
            public String toString() {
                return name;
            }
        }
        Newspaper newspaper= new Newspaper();
        System.out.println(this + " read " + newspaper);
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
    public boolean isWasThreatened() {
        return wasThreatened;
    }

    public void setWasThreatened(boolean wasThreatened) {
        this.wasThreatened = wasThreatened;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
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
