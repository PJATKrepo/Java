import java.util.Random;

public class Archer extends Character {
    private Random rand = new Random();

    public Archer(String name, int strength) {
        super(name, strength);
    }

    @Override
    public int performAttack() {
        boolean crit = rand.nextBoolean();
        int damage = strength;

        if (crit) {
            damage *= 2;
            System.out.println("Archer " + name + " hits the eye!  CRITICAL HIT! (" + damage + " dmg");
            return damage;
        } else {
            System.out.println("Archer " + name + " shoots an arrow dealing " + damage + " damage");
            return damage;
        }
    }

    @Override
    public String introduceSelf() {
        return "[Archer] " + super.introduceSelf();
    }
}