public class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }
    public void reaction_1() {
        System.out.printf("%s мурлычит", name);
    }

    public void reaction_2() {
        System.out.printf("%s подходит", name);
    }
}
