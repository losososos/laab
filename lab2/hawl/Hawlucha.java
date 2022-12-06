package hawl;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hawlucha extends Pokemon{


    public Hawlucha(String name, int lvl) {

        super(name, lvl);
        this.addType(Type.FIGHTING);
        this.setStats(78, 92, 75, 74, 63, 118);

        this.setMove(new RockTomb(), new Psychic(), new Waterfall(), new DoubleTeam());

    }

    public Hawlucha() {
        super();

        this.addType(Type.FIGHTING);
        this.setStats(78, 92, 75, 74, 63, 118);
        this.setMove(new RockTomb(), new Psychic(), new Waterfall(), new DoubleTeam());
    }

}
