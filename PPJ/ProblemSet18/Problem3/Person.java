import java.awt.Color;

public class Person {
    public String name;
    public int birthYear;
    public Car car;

    public Person(String name, int birthYear, Car car) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = car;
    }

    public static Car[] findAllCars(Person[] persons) {
        int count = 0;
        for (Person p : persons) {
            if (p != null && p.car != null) {
                count++;
            }
        }

        Car[] cars = new Car[count];
        int index = 0;
        for (Person p : persons) {
            if (p != null && p.car != null) {
                cars[index++] = p.car;
            }
        }
        return cars;
    }

    public static Person[] findOwners(Person[] persons, String make) {
        int count = 0;
        for (Person p : persons) {
            if (p != null && p.car != null && p.car.make.equals(make)) {
                count++;
            }
        }

        Person[] owners = new Person[count];
        int index = 0;
        for (Person p : persons) {
            if (p != null && p.car != null && p.car.make.equals(make)) {
                owners[index++] = p;
            }
        }
        return owners;
    }

    public static Color findColor(Person[] persons, String name, int year) {
        for (Person p : persons) {
            if (p != null && p.name.equals(name) && p.birthYear == year) {
                if (p.car != null) {
                    return p.car.color;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name + " (" + birthYear + ")" + (car != null ? " owns " + car.make : "");
    }
}