import java.util.Scanner;

public class Problem3 {
    void main() {
        String[][] arr = {
                {"Kenya", "Nairobi"}, {"Rwanda", "Kigali"},
                {"Gambia", "Banjul"}, {"Ghana", "Accra"},
                {"Niger", "Niamey"}, {"Zambia", "Lusaka"},
                {"Ukraine", "Kyiv"}, {"Poland", "Warsaw"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a country: ");
        String searchedCountry = scanner.nextLine();

        searchCountry(arr, searchedCountry);
    }

    void searchCountry(String[][] arr, String searchedCountry) {
        boolean found = false;
        String foundCapital = "";

        for (int i = 0; i < arr.length; i++) {
            String countryFromArr = arr[i][0];

            if (searchedCountry.equalsIgnoreCase(countryFromArr)) {
                foundCapital = arr[i][1];
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The capital is: " + foundCapital);
        } else
            System.out.println("Country not found.");
    }
}