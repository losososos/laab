package swmp.Lotad;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import swmp.Lombre.Lombre;
import swmp.Lotad.IceBeam;
import swmp.Lotad.Scald;

public class Lotad extends Pokemon {


    public Lotad(String name, int lvl) {

        super(name, lvl);
        this.setType(Type.WATER, Type.GRASS);
        this.setStats(40, 30, 30, 40, 50, 30);

        this.setMove(new Scald(), new IceBeam());

    }

    public Lotad() {
        super();

        this.setType(Type.WATER, Type.GRASS);
        this.setStats(40, 30, 30, 40, 50, 30);
        this.setMove(new Scald(), new IceBeam());
    }

}
