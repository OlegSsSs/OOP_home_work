public class Cupboard {

    public String name;
    private boolean isOpenCupboard;
    private boolean keysIn;
    public Cupboard(String name) {
        this.name = name;
        this.isOpenCupboard = false;
        this.keysIn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void openCupboard() {
        isOpenCupboard = true;
        System.out.printf("%s двери открыты", name);
    }

    public void closeCupboard() {
        isOpenCupboard = false;
        System.out.printf("%s двери закрыты", name);
    }
    public void keysIn() {
        keysIn = true;
        System.out.println("есть ключ");
    }

    public void keysOut() {
        keysIn = false;
        System.out.println("нет ключа");
    }
}
