public abstract class Order {
    //Attributes
    protected int id;
    protected int total;
    protected String name;

    //Constructor
    public Order(int id, int total, String name) {
        this.id = id;
        this.total = total;
        this.name = name;
    }

    //Methods
    //Abstract method ---
    public abstract void cancel(); //we give a method signature only - these will be defined by the Child Class

    public String displayOrder() { //We can also write who functions that will be inherited.
        return this.name;
    }

    //Gettrs & Settrs
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
