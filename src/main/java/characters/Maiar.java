package characters;

public class Maiar extends Character{
    private boolean good;
    public Maiar(String name, String origin, Role role, String specialPower, Boolean good) {
        this.setName(name);
        this.setOrigin(origin);
        this.setRole(role);
        this.good = good;
    }

    @Override
    public String present() {
        String alignment = good ? "orientado hacia la luz" : "orientado hacia la oscuridad";

        return "Soy un Maiar de %s llamado %s, and my alignment is %s."
                .formatted(this.getOrigin(), this.getName(), alignment);
    }
}
