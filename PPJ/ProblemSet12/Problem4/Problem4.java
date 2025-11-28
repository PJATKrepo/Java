public class Problem4 {
    public static void main(String[] args) {
        Person[] group = {
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25)
        };

        Person.sort(group);

        for (Person p : group) {
            System.out.println(p);
        }
    }
}