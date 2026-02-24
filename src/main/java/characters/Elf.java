package characters;

public class Elf extends Character {

    private int agility;

    public Elf(String name, String origin, Role role, int agility) {
        this.setName(name);
        this.setOrigin(origin);
        this.setRole(role);
        this.agility = agility;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}