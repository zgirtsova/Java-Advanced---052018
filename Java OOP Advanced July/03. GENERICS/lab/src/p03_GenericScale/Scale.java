package p03_GenericScale;


public class Scale<T extends Comparable> {

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return this.left;
    }

    public T getRight() {
        return this.right;
    }

    public T getHeavier() {
        int comparer = this.getLeft().compareTo(this.getRight());
        return comparer > 0 ? this.getLeft() : comparer < 0 ? this.getRight() : null;
    }
    public static <V extends Comparable<V>> int countGreaterThan(V[] anArray, V elem) {
        int count = 0;
        for (V e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
