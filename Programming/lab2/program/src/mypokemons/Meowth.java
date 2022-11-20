package mypokemons;

import mymoves.Bite;
import mymoves.Confide;
import mymoves.FurySwipes;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meowth extends Pokemon {
    public Meowth(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(40, 45, 35, 40, 40, 90);

        FurySwipes furySwipes = new FurySwipes(18, 80);
        Bite bite = new Bite(60, 100);
        Confide confide = new Confide(0, 0);
        super.setMove(furySwipes, bite, confide);
    }
}
