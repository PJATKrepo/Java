import java.util.Arrays;

public class Problem5 {
    void main() {
        int[][][] opers = {
                {
                        {100, -50, 25},
                        {150, -300},
                        {300, -90, 100}
                },
                {
                        {90, -60, 250},
                        {300, 20, -100}
                },
                {
                        {20, 50},
                        {300},
                        {20, -20, 40},
                        {100, -200}
                }
        };

        int numCustomers = opers.length;
        int[] customerTotals = new int[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            int totalForCustomer = 0;

            for (int j = 0; j < opers[i].length; j++) {

                for (int k = 0; k < opers[i][j].length; k++) {
                    totalForCustomer += opers[i][j][k];
                }
            }
            customerTotals[i] = totalForCustomer;
        }

        System.out.println("Total sums for all customers:");
        System.out.println(Arrays.toString(customerTotals));
    }
}