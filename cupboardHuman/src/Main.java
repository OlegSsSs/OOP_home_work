public class Main {
    public static void main(String[] args) {
        Person i_am = new Person("пользователь");
        Cupboard cupboard = new Cupboard("шкаф в прихожей");

        i_am.keysIn(cupboard);
        System.out.println("\n");
        i_am.openCupboard(cupboard);
        System.out.println("\n");
        i_am.closeCupboard(cupboard);
        System.out.println("\n");
        i_am.keysOut(cupboard);
    }
}