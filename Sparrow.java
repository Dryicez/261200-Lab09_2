package oop.lsp;

public class Sparrow implements Flyable {
    @Override
    public void move() { fly(); }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
