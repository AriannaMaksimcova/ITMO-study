package characters;
import exceptions.VariableWasNotInitializedException;
import locations.Hotel;

public class OwnerOfHotel extends Person {
    private Hotel hotel;

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
    public void checkIntoHotel(Person person) throws VariableWasNotInitializedException {
            if (hotel.numberOfResidents == 0){
                throw new VariableWasNotInitializedException("Количиство жильцов не было определено");
            }else{
                hotel.numberOfResidents += 1;
                System.out.println(person + " засилен в номер " + hotel.checkIntoHotel(person));
            }

    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
