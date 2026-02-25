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

    @Override
    public String present() {
        return "Soy un humano de las tierras de "+this.getOrigin()+", con una sabiduría de "
                +this.wisdom+" y una fuerza de "+this.strength;
    }
}