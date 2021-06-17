public class ZooKeeper {
    public static void main(String[] args) {
        // Animal lion = new Animal("Simba", 5, 150, 5, false);
    //     Animal giraffe = new Animal("Jeff", 5, 150, 5);
    //     Animal godmode = new Animal();
    //     System.out.println(giraffe.getCanFly());
    //     System.out.println(godmode.getName());
    //     System.out.println(godmode.getStr());

    //     lion.battle(giraffe, "water Gun");
        
    //     System.out.println(giraffe.getHealth());
        // Gorilla tyke = new Gorilla();
        // // System.out.println(tyke.species);
        // Barrel barrel = new Barrel();

        // System.out.println(barrel.getHealth());
        // tyke.attack(barrel);
        // System.out.println(barrel.getHealth());
        Order o = new OnlineOrder(123, 300, "guitar");
        System.out.println(o.displayOrder());
        o.cancel();

    }
}
