package swmp.Lotad;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam(){
        this.type = Type.ICE;
        this.power = 90;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "use Ice Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (new Effect().chance(0.1).success()){
            Effect.freeze(pok);
        }
    }

}