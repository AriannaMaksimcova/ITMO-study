package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaws extends PhysicalMove {
    public ShadowClaws(double pow, double acc){
        super(Type.GHOST, pow, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1d / 8d;
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
