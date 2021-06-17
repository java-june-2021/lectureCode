public class Mammal {
    protected String species;
    protected int health;

    public Mammal(String species, int health) {
        this.species = species;
        this.health = health;
    }

    public void attack(Mammal target) {
        target.health -= 5;
    }


    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
