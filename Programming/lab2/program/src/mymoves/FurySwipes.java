package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {

    public FurySwipes(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }


    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        for (int i = 0; i < number(); i++){
            super.applyOppDamage(p, damage);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    public static double number(){
        double num = Math.random() * 10;
        if (num <= 2.5){
            return 2;
        } else if(2.5 < num && num <= 5.0){
            return 3;
        } else if (5.0 < num && num <= 7.5) {
            return 4;
        } else{
            return 5;
        }
    }
}
