package swmp.Lotad;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scald extends PhysicalMove {

    public Scald(){
        this.type = Type.WATER;
        this.power = 80;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "use Scald";
    }
    @Override
    protected void applyOppEffects(Pokemon pok){
        if(Math.random() <= 0.3){
            Effect.burn(pok);
        }
    }
}