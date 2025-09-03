package oop.lsp;

public class Eagle implements Flyable {
    @Override
    public void move() { fly(); }

    @Override
    public void fly() {
        System.out.println("Eagle soars high.");
    }
}
