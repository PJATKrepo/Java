import java.util.Random;

public class Mage extends Character {
    private Random rand = new Random();

    public Mage(String name, int strength) {
        super(name, strength);
    }

    @Override
    public int performAttack() {
        int baseDamage = 20;
        int damage = baseDamage + rand.nextInt(15) + (strength / 2);
        System.out.println("Mage " + name + " casts a fireball dealing " + damage + " damage!");
        return damage;
    }

    @Override
    public String introduceSelf() {
        return "[Mage] " + super.introduceSelf();
    }
}