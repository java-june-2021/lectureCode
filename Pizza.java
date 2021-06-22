public class Pizza {
    static int pizzasMade = 0;
    private String name;
    private String[] toppings;
    private char size;
    private int slices;
    private String cheeseType;
 

    // Constructor
    public Pizza(String name, String[] toppings, char size, int slices, String cheeseType){
        this.name = name;
        this.toppings = toppings;
        this.size = size;
        this.slices = slices;
        this.cheeseType = cheeseType;
        pizzasMade += 1;
    }

    // Method Overloading
    public Pizza(String name, String[] toppings){
        this.name = name;
        this.toppings = toppings;
        this.size = 'L';
        this.slices = 8;
        this.cheeseType = "Ricotta";
        pizzasMade += 1;
    }

    //Methods go here
        // Getters and Setters
    public String getName(){
        return this.name;
    }

    public String[] getToppings(){
        return this.toppings;
    }
    
    public char getSize(){
        return this.size;
    }
    
    public int getSlices(){
        return this.slices;
    }
    
    public String getCheeseType(){
        return this.cheeseType;
    }

    public void setName(String name){
        if(name.equals("")){
            System.out.println("Name must be more than 1 character");
            return;
        }
        if(name.length() < 4){
            System.out.println("must be at least 4 characertrs");
        }
        this.name = name;
    }

    public void setToppings(String[] toppings){
        this.toppings = toppings;
    }

    public void setSize(char size){
        this.size = size;
    }

    public void setSlices(int slices){
        this.slices = slices;
    }

    public void setCheeseType(String cheeseType){
        this.cheeseType = cheeseType;
    }

    public static void advertise(){
        System.out.println("Come to matt's pizza shop, were not mafia owned, wink wink..");
    }

    public int eatSlices(int slices){
        this.slices -= slices;
        pizzasMade -= 1;
        return this.slices;
    }

    // Method Overloading
    public double eatSlices(double slices){
        this.slices -= slices;
        return this.slices;
    }

    public void pizzaFight(Pizza otherPizza){
        int numberOfSlices = otherPizza.getSlices();
        numberOfSlices -= 1;
        otherPizza.setSlices(numberOfSlices);
        System.out.println(this.name + " punched " + otherPizza.getName() + " for 1 slice!");
    } 
}