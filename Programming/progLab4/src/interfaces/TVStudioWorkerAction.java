package interfaces;

import characters.OwnerActionOfTVStudio;
import characters.Person;
import characters.Showman;

public interface TVStudioWorkerAction {
    boolean isAgreeWithConditions(OwnerActionOfTVStudio character, double need, double suggested);
    double putForwardConditions(Showman withWho, Person toWhom, String what);

}
