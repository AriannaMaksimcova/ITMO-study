package interfaces;

import characters.OwnerActionOfTVStudio;
import enums.Performance;

public interface Emotional {
    void getAngry();

    void getAngryAt(OwnerActionOfTVStudio character);
    void beSurprised();
    void beSurprised(String reason);
    void toBeAfraid();
    void toBeAfraid(Performance performance);
    void getScared();

}
