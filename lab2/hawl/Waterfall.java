package hawl;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {

    public Waterfall(){
        this.type = Type.ROCK;
        this.power = 60;
        this.accuracy = 95;

    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (new Effect().chance(0.2).success() && pok.getCondition()==Status.NORMAL) {
            Effect.flinch(pok);
        }
    }

    @Override
    protected String describe() {
        return "use Waterfall";
    }

}