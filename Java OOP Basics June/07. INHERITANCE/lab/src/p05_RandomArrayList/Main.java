package p05_RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList ral = new RandomArrayList();

        ral.add("s");
        ral.add("2");
        ral.add("e");
        ral.add("5");
        ral.add("2");

        System.out.println(ral.getRandomElement());
        System.out.println(ral);
    }
}
