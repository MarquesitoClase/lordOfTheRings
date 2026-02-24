package characters;

public class Hobbit extends Character{

    private int courage;

    public Hobbit(String name, String origin, Role role, int courage){
        this.setName(name);
        this.setOrigin(origin);
        this.setRole(role);
        this.setCourage(courage);
    }

    public int getCourage(){
        return courage;
    }

    private void setCourage(int courage) {
        this.courage = courage;
    }
}
