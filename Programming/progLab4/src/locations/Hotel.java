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
        this.boss.hotel = this;
    }
    public Hotel(String name, OwnerOfHotel boss, int numberOfResidents) {
        this.name = name;
        this.boss = boss;
        this.boss.hotel = this;
        this.numberOfResidents = numberOfResidents;
    }
    public class Room{
        private final int number;
        private final ArrayList<Person> residents = new ArrayList<Person>();
        public Room(int number) {
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
        Room room = new Room((int) (Math.random() * 100));
        room.checkIntoRoom(person);
        this.residents.add(person);
        return room.getNumber();
    }

    @Override
    public String toString() {
        return name;
    }
}
