package mypokemons;

import mymoves.Bite;
import mymoves.Confide;
import mymoves.FurySwipes;
import mymoves.PlayRough;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Persian extends Pokemon {
    public Persian(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(65, 70, 60, 65, 65, 65);

        FurySwipes furySwipes = new FurySwipes(18, 80);
        Bite bite = new Bite(60, 100);
        Confide confide = new Confide(0, 0);
        PlayRough playRough = new PlayRough(90, 90);
        super.setMove(furySwipes, bite, confide, playRough);
    }
}
