package hawl;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {

    public RockTomb(){
        this.type = Type.ROCK;
        this.power = 60;
        this.accuracy = 95;

    }

    @Override
    protected String describe() {
        return "use Rock Tomb";
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {

        pok.addEffect(new Effect().stat(Stat.SPEED,-1).turns(1));
    }
}
