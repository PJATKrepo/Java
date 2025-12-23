import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }

        Person[] persons = null;

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line = br.readLine();
            if (line != null) {
                int n = Integer.parseInt(line.trim());
                persons = new Person[n];

                for (int i = 0; i < n; i++) {
                    line = br.readLine();
                    if (line == null) break;

                    String[] parts = line.trim().split("\\s+");

                    String name = parts[0];
                    int year = Integer.parseInt(parts[1]);
                    Car car = null;

                    if (parts.length >= 5) {
                        String make = parts[2];
                        int r = Integer.parseInt(parts[3]);
                        int g = Integer.parseInt(parts[4]);
                        int b = Integer.parseInt(parts[5]);
                        car = new Car(make, new Color(r, g, b));
                    }

                    persons[i] = new Person(name, year, car);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        if (persons != null) {
            Car[] allCars = Person.findAllCars(persons);
            System.out.println("All Cars found: " + allCars.length);

            Person[] mercedesOwners = Person.findOwners(persons, "Mercedes");
            System.out.println("Mercedes owners: " + mercedesOwners.length);
            for(Person p : mercedesOwners) {
                System.out.println(p.name);
            }

            Color c = Person.findColor(persons, "Alice", 1993);
            System.out.println("Alice's car color: " + c);
        }
    }
}