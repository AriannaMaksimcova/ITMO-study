package interfaces;

import characters.OwnerOfTVStudio;
import characters.Person;
import characters.Showman;

public interface TVStudioWorker {
    boolean isAgreeWithConditions(OwnerOfTVStudio character, double need, double suggested);
    double putForwardConditions(Showman withWho, Person toWhom, String what);

}
