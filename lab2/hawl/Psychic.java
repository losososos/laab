package hawl;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove {

    public Psychic(){
        this.type = Type.PSYCHIC;
        this.power = 90;
        this.accuracy = 100;

    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1).turns(-1));
    }

    @Override
    protected String describe() {
        return "use Psychic";
    }

}