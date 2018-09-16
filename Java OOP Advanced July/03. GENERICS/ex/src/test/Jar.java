package test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {

    private T value;
    public   void save(T item) {
        this.value = item;
    }
    private Deque<T> content;
    public Jar() { this.content = new ArrayDeque<>(); }
    public void add(T entity) {
        this.content.push(entity);
    }
    public T remove() { return this.content.pop(); }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Deque<T> getContent() {
        return content;
    }

    public void setContent(Deque<T> content) {
        this.content = content;
    }
}

