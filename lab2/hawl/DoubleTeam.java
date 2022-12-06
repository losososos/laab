package hawl;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove{

    public DoubleTeam(){
        this.type = Type.NORMAL;
    }

    @Override
    protected String describe() {
        return "use DoubleTeam";
            }

    @Override
    protected void applySelfEffects(Pokemon pok) {

        pok.addEffect(new Effect().stat(Stat.EVASION, +1));
    }

}