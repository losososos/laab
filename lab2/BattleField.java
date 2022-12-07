import ee.Eevee.Eevee;
import ee.Espeon.Espeon;
import hawl.Hawlucha;
import swmp.Lombre.Lombre;
import swmp.Lotad.Lotad;
import swmp.Ludicolo.Ludicolo;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class BattleField{
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Hawlucha("a", 30);
        Pokemon p2 = new Lombre("b", 30);
        Pokemon p3 = new Espeon("c", 30);
        Pokemon p4 = new Ludicolo("d", 30);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go();
    }
}
