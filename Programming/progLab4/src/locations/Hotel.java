package locations;

import characters.OwnerOfHotel;
import characters.Person;
import interfaces.Location;
import java.util.ArrayList;

public class Hotel implements Location {
    String name;
    public OwnerOfHotel boss;
    public int paymentForRoom = 150; // $
    public ArrayList<Person> residents = new ArrayList<Person>();
    public int numberOfResidents;



    public Hotel(String name, OwnerOfHotel boss) {
        this.name = name;
        this.boss = boss;
        this.boss.setHotel(this);
    }
    public Hotel(String name, OwnerOfHotel boss, int numberOfResidents) {
        this.name = name;
        this.boss = boss;
        this.boss.setHotel(this);
        this.numberOfResidents = numberOfResidents;
    }
    public class HotelRoom {
        private final int number;
        private final ArrayList<Person> residents = new ArrayList<Person>();
        public HotelRoom(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
        public void checkIntoRoom(Person person){
            residents.add(person);
        }
    }
    public int checkIntoHotel(Person person){
        HotelRoom hotelRoom = new HotelRoom((int) (Math.random() * 100));
        hotelRoom.checkIntoRoom(person);
        this.residents.add(person);
        return hotelRoom.getNumber();
    }

    @Override
    public String toString() {
        return name;
    }
}
