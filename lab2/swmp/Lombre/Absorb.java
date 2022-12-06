package swmp.Lombre;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.DamageMove;
import ru.ifmo.se.pokemon.Type;

public class Absorb extends SpecialMove {

    public Absorb(){
        this.type = Type.GRASS;
        this.power = 20;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {

        return "use Absorb";
    }
}