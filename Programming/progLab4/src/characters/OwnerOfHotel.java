package characters;
import exceptions.VariableWasNotInitialized;
import locations.Hotel;

public class OwnerOfHotel extends Person {
    public Hotel hotel;

    public OwnerOfHotel(String name) {
        super(name);
    }

    public void setPaymentForRoom(int paymentForRoom) {
        hotel.paymentForRoom = paymentForRoom;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public void agreeWithConditions(Person character) {
        if (wasThreatened){
            this.toSay("Угрозы подействовали. " + character.toString() + " и его друзья могут жить в моей " +
                    "гостинице бесплатно.");
        }
    }
    public void checkIntoHotel(Person person) throws VariableWasNotInitialized {
        try {
            hotel.numberOfResidents += 1;
        } catch (Exception e) {
            throw new VariableWasNotInitialized("Количиство жильцов не было определено");
        }
        System.out.println(person + " засилен в номер " + hotel.checkIntoHotel(person));

    }
}
