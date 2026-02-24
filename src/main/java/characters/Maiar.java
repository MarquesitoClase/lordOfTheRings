package characters;

public class Maiar extends Character{
    private boolean good;
    public Maiar(String name, String origin, Role role, String specialPower, Boolean good) {
        this.setName(name);
        this.setOrigin(origin);
        this.setRole(role);
        this.good = good;
    }
}
