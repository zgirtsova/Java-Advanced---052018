package p10_tuple;

public class Tuple<T, E> {

    private T firstItem;
    private E secondItem;

    public Tuple(T item1, E item2) {
        this.firstItem = item1;
        this.secondItem = item2;
    }

    public T getFirstItem() {
        return this.firstItem;
    }

    public E getSecondItem() {
        return this.secondItem;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",
                String.valueOf(this.getFirstItem()),
                String.valueOf(this.getSecondItem()));
    }
}
