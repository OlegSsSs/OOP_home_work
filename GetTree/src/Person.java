public class Person implements Comparable<Person> {
    public String fullName;
    public Integer age;

    public int getAge() {
        return age;
    }

    public Person(String fullName, Integer age) {
        if (fullName != null){
            this.fullName = fullName;
        }
        this.age = age;
    }

    public String toString() {
        return String.format("%s %d\n", this.fullName, this.age);
    }

    @Override
    public int compareTo(Person o) {            // как реализовать метод для сортировки совершеннолетних??
        if (o.getAge() > this.getAge()) {
            return -1;
        } else if (o.getAge() == this.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }
}

