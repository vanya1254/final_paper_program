package model;

public class Counter implements AutoCloseable {
    private int count;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        System.out.println("Closing the Counter.");
    }
}
