package characters;

public class Human extends Character {

    private int strength;
    private int wisdom;

    public Human(String name, String origin, Role role, int strength, int wisdom) {
        this.setName(name);
        this.setOrigin(origin);
        this.setRole(role);
        this.strength = strength;
        this.wisdom = wisdom;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
}