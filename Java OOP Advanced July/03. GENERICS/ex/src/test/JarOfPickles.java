package test;

class JarOfPickles<T> extends Jar<T> {

    private T neshto;
    private int sth;
    public JarOfPickles() {
        super();
    }

    public void getSth() {
        T sth = super.remove();
    }

}

