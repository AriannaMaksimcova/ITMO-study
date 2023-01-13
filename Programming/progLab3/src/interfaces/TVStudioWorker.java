package interfaces;

import characters.OwnerOfTVStudio;
import characters.Showman;

public interface TVStudioWorker {
    boolean isAgreeWithConditions(OwnerOfTVStudio character, double need, double suggested);
    double putForwardConditions(Showman withWho, OwnerOfTVStudio toWhom);
}
