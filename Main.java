package oop.lsp;

public class Lab09_2 {
    
    static void parade(Moveable m) {
        m.move();
    }

    static void airShow(Flyable f) {
        f.fly();
    }

    public static void main(String[] args) {
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        System.out.println("=== Parade (Moveable) ===");
        parade(penguin);
        parade(ostrich);
        parade(sparrow);
        parade(eagle);

        System.out.println("\n=== Air Show (Flyable only) ===");
        airShow(sparrow);
        airShow(eagle);

        System.out.println("\n=== Flyable as Moveable ===");
        parade(sparrow);
        parade(eagle);
    }
}
