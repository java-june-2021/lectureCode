public class Gorilla extends Mammal implements Attackable {
    
    public Gorilla() {
        super("Gorilla", 500);
    }

    public void attack(Attackable target) {
        target.setHealth(target.getHealth() - 15);
    }

}
