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
        String alignment = good ? "hacia la luz" : "hacia la oscuridad";

        return "Soy un Maiar de %s llamado %s, and mi orientación es %s."
                .formatted(this.getOrigin(), this.getName(), alignment);
    }
}
