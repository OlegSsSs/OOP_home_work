public class Person {
    public String name;


    public Person(String fullName) {
        if (name != null) {
            this.name = fullName;
        }
    }

    public String toString() {
        return String.format("%s \n", this.name);
    }

    public void openCupboard(Cupboard o) {
        o.openCupboard();
    }
    public void closeCupboard(Cupboard o) {
        o.closeCupboard();
    }

    public void keysIn(Cupboard o) {
        o.keysIn();
    }

    public void keysOut(Cupboard o) {
        o.keysOut();
    }
}