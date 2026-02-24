package characters;

public class Orc extends Character{
    private int strength;

    public Orc(String name, String origin, Role role, int strength) {
        this.setName(name);
        this.setOrigin(origin);
        this.setRole(role);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}