import characters.OwnerOfTVStudio;
import characters.Person;
import characters.Showman;
import electronics.Phone;
import electronics.Television;
import enums.Performance;
import enums.TimeOfDay;
import workplaces.TVStudio;

public class Main {

    public static void main(String[] args) {
        OwnerOfTVStudio ownerOfTelevisionStudio = new OwnerOfTVStudio("Owner Of TV Studio");
        Showman julio = new Showman("Julio");
        Showman miga = new Showman("Miga");
        Showman[] workersOfTVStudio = {miga, julio};
        TVStudio tvStudio = new TVStudio(ownerOfTelevisionStudio, workersOfTVStudio);
        Television television = new Television(tvStudio);
        Phone phone = new Phone();
        Person viewers = new Person("Viewers", television, phone);

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
        viewers.toThreaten(ownerOfTelevisionStudio);
        tvStudio.showPerformance();
    }
}