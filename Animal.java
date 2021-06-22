public class Animal {
    //attributes
    private String name;
    private int str;
    private int health;
    private int clawNumber;
    private boolean canFly;
    
    //contructor -- Method Overloading
    public Animal(String name, int str, int health, int clawNumber, boolean canFly) { //method signature
        this.name = name;
        this.str = str;
        this.health = health;
        this.clawNumber = clawNumber;
        this.canFly = canFly;
    }

    public Animal(String name, int str, int health, int clawNumber) {
        this.name = name;
        this.str = str;
        this.health = health;
        this.clawNumber = clawNumber;
        this.canFly = false;
    }

    public Animal() {
        this.name = "Maximus";
        this.str = 9001;
        this.health = 5000;
        this.clawNumber = 75;
        this.canFly = true;
    }

    //methods
    public void battle(Animal target, String powerMove) {
        int damage = 0;

        if(powerMove.equals("body slam")) {
            damage = 3 * this.str;
        } else if(powerMove.equals("Eye Lasers")) {
            damage = 4 * this.str;
        } else if(powerMove.equals("water Gun")) {
            damage = 6 * this.str;
        } else {
            System.out.println("Move not learned yet");
        }
        //we need to subtract damage from target hp
        //save the new target hp into target object
        // target.getHealth() = 100
        
        target.setHealth(target.getHealth() - damage);
        System.out.printf("%s battles %s; used %s and dealt %d damage\n", this.name, target.name, powerMove, damage);
    }

    //gettrs and settrs
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public int getStr() {
        return this.str;
    }

    public void setStr(int str) {
        this.str = str;
    }
 
    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
 
    public int getClawNumber() {
        return this.clawNumber;
    }

    public void setClawNumber(int clawNumber) {
        this.clawNumber = clawNumber;
    }
 
    public boolean getCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}