import characters.*;
import electronics.Phone;
import electronics.Television;
import enums.Performance;
import enums.TimeOfDay;
import exceptions.VariableWasNotInitialized;
import locations.Hotel;
import workplaces.FoodFactory;
import workplaces.TVStudio;

public class Main {

    public static void main(String[] args) throws VariableWasNotInitialized {
        OwnerOfTVStudio ownerOfTelevisionStudio = new OwnerOfTVStudio("Owner Of TV Studio");
        Showman julio = new Showman("Julio");
        Showman miga = new Showman("Miga");
        Showman[] workersOfTVStudio = {miga, julio};
        TVStudio tvStudio = new TVStudio(ownerOfTelevisionStudio, workersOfTVStudio);
        Television television = new Television(tvStudio);
        Phone phone = new Phone();
        Person viewers = new Person("Viewers", television, phone);
        Person visitors = new Person("Visitors from other cities");
        OwnerOfHotel mrHaps = new OwnerOfHotel("Mr.Haps");
        Hotel emeraldHotel = new Hotel("Изумруд", mrHaps, 0);
        Person foodFactoryOwner = new Person("Владелец фабрики");
        Person[] foodFactoryWorkers = new Person[]{viewers};
        FoodFactory foodFactory = new FoodFactory("Фабрика", foodFactoryOwner, foodFactoryWorkers,
                true, new String[]{"конфеты", "коврижки", "хлеб", "колбаса", "мороженое"});
        Doctor doctor = new Doctor("Доктор", true);


        viewers.toEat(foodFactory);
        viewers.toBeTreatedByDoctor(doctor);

        FoodFactory.FoodShop.useAdvertisementsOnTheWall("коврижки");
        viewers.toGo(FoodFactory.FoodShop);
        viewers.toBuy("мороженое", foodFactory, FoodFactory.FoodShop);


        System.out.println("В эти дни город Давилон гудел, словно растревоженный улей.");
        viewers.toAwake();

        mrHaps.checkIntoHotel(julio);
        mrHaps.checkIntoHotel(miga);

        viewers.toWant("хоть краешком глаза увидеть коротышку, прибывшего из глубин космоса.");
        for (int i = 0; i < TimeOfDay.values().length; i++) {
            TimeOfDay night = TimeOfDay.NIGHT;
            if(TimeOfDay.values()[i] != night){
                System.out.println("Now is " + TimeOfDay.values()[i] + ".");
                viewers.toGo(emeraldHotel);
            }
        }
        visitors.toWant(" селиться только в гостницу " + emeraldHotel + " ,так как только там они могут запросто " +
                "встретиться с космонавтом и посмотреть на него вблизи.");
        mrHaps.checkIntoHotel(visitors);
        if(emeraldHotel.numberOfResidents > 2){
            mrHaps.setPaymentForRoom(emeraldHotel.paymentForRoom * 2);
        }


        if(emeraldHotel.paymentForRoom > 200){
            miga.toThreaten(mrHaps, mrHaps + " поднял цены. Мы не будем платить такие деньги за номер! " +
                    "Мы с Незнайкой переедем в другую гостиницу.");
            mrHaps.agreeWithConditions(miga);
        }


        viewers.toBeAfraid(Performance.DUNNO_ON_THE_MOON);
        do {
            for (int i = 0; i < TimeOfDay.values().length; i++) {
                System.out.println("Now is " + TimeOfDay.values()[i] + ".");
                viewers.watchTV(television);
                viewers.setStateOfPatience(viewers.getStateOfPatience() + Math.random() * 500);
            }
        } while (viewers.getStateOfPatience() <= 100);
        viewers.beSurprised(Performance.DUNNO_ON_THE_MOON + " has not been shown yet.");
        viewers.getAngryAt(ownerOfTelevisionStudio);
        viewers.callByPhone(phone, ownerOfTelevisionStudio);
        viewers.toThreaten(ownerOfTelevisionStudio, "Мы прекратим выплату взносов за пользование " +
                "телевизорами, если вы не покажете нам Незнайку!");
        tvStudio.showPerformance();
        tvStudio.showConference();
    }
}