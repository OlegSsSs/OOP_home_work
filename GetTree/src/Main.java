import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person i_am = new Person("I_am", 33);
        Person dad = new Person("Dad", 62);
        Person mom = new Person("Mom", 64);
        Person grand_pa = new Person("Grand_pa", 80);
        Person grand_ma = new Person("Grand_ma", 84);
        Person first_child = new Person("First child", 10);
        Person second_child = new Person("Second child", 12);

        List<Person> over_21 = new ArrayList<>();
        over_21.add(new Person("I_am", 33));
        over_21.add(new Person("Dad", 62));
        over_21.add(new Person("Mom", 64));
        over_21.add(new Person("Grand_pa", 80));
        over_21.add(new Person("Grand_ma", 84));
        over_21.add(new Person("First child", 10));
        over_21.add(new Person("Second child", 12));

//        Collections.sort(over_21);


        for (Person person : over_21) {
            Integer max = 21;
                if (person.age > max ) {
                    System.out.println("Старше 21 года: " + person.fullName + " ");
                }
        }
        System.out.println("_______");




        GeoTree gt = new GeoTree();

//        Scanner sc = new Scanner();

//        System.out.printf("%s %d\n", i_am.fullName, i_am.age);
//        System.out.printf("%s %d\n", dad.fullName, dad.age);

        gt.append(dad, i_am);
        gt.append(mom, i_am);

        gt.append(grand_ma, dad);
        gt.append(grand_pa, dad);

        gt.append(i_am, first_child);
        gt.append(i_am, second_child);

        gt.appendGrand(grand_ma, first_child);
        gt.appendGrand(grand_pa, second_child);



        System.out.println("Я родитель для " + new Research(gt).spend(i_am,
                Relationship.parent));
        System.out.println("Мои родители " + new Research(gt).spend(i_am,
                Relationship.children));
        System.out.println("Родители моего отца " + new Research(gt).spend(dad,
                Relationship.children));
        System.out.println("Внук моего отца " + new Research(gt).spend(grand_pa,
                Relationship.grandparent));
        System.out.println("Внук моей мамы " + new Research(gt).spend(grand_ma,
                Relationship.grandparent));
    }
}