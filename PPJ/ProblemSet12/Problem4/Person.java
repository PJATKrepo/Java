public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person other) {
        return this.age - other.age;
    }

    public static void sort(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].compareTo(people[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}