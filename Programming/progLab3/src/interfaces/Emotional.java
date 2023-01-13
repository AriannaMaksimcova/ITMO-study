package interfaces;

import characters.OwnerOfTVStudio;
import enums.Performance;

public interface Emotional {
    void getAngry();

    void getAngryAt(OwnerOfTVStudio character);
    void beSurprised();
    void beSurprised(String reason);
    void toBeAfraid();
    void toBeAfraid(Performance performance);

}
