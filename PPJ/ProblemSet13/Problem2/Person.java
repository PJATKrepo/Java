public class Person {
    private String name;
    private Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return name + (car != null ? " has " + car : " has no car");
    }

    public static Car[] getCars(Person[] persons) {
        int count = 0;
        for (Person p : persons) {
            if (p.getCar() != null) {
                count++;
            }
        }
        Car[] cars = new Car[count];
        int index = 0;
        for (Person p : persons) {
            if (p.getCar() != null) {
                cars[index++] = p.getCar();
            }
        }
        return cars;
    }

    public static Car[] expensiveCars(Person[] persons, int minPrice) {
        int count = 0;
        for (Person p : persons) {
            if (p.getCar() != null && p.getCar().getPrice() >= minPrice) {
                count++;
            }
        }
        Car[] cars = new Car[count];
        int index = 0;
        for (Person p : persons) {
            if (p.getCar() != null && p.getCar().getPrice() >= minPrice) {
                cars[index++] = p.getCar();
            }
        }
        return cars;
    }

    public static int getPrice(Person[] persons, String name) {
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                if (p.getCar() != null) {
                    return p.getCar().getPrice();
                } else {
                    return -1;
                }
            }
        }
        return -2;
    }
}