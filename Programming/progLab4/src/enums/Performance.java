package enums;

import java.util.Random;

public enum Performance {
    WINNI_THE_POOH,
    THREE_FROM_PROSTOKVASHINO,
    THE_SCARLET_FLOWER,
    CROCODILE_GENA_AND_CHEBURASHKA,
    NU_POGODI,
    THERE_ONCE_WAS_A_DOG,
    DUNNO_ON_THE_MOON;
    private static final Random rnd = new Random();
    public static Performance randomPerformance(){
        Performance[] performances = values();
        return performances[rnd.nextInt(performances.length-1)];
    }
}
