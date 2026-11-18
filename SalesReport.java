import java.util.Scanner;
public class SalesReport {
    private static final Object PRODUCT = ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// 1. Single-dimensional array for product names
        String[] productNames = {
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
        };
// 2. Two-dimensional array for monthly sales data (3 products x 3 months)
        int[][] salesData = new int[3][3];
// Capture sales data from the user matching the sample screenshots
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
        }
// Calculations
        int totalProductSales = 0;
        int totalEntries = 0;
        int maxSales = -1;
        String mostPopularProduct = "";
        for (int i = 0; i < productNames.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
                totalEntries++;
            }
            totalProductSales += currentProductTotal;
// Track the most popular product based on highest total sales
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                mostPopularProduct = productNames[i] + " (" + maxSales + ")";
            }
        }
        double averageProductSales = totalEntries == 0 ? 0 : (double) totalProductSales / totalEntries;
// Display Report Matching the Sample Output Format
        System.out.println("
                PRODUCT SALES REPORT - 2026");
                System.out.println("");
        System.out.println("TOTAL PRODUCT SALES: " + totalProductSales);
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(averageProductSales));
        System.out.println("MOST POPULAR PRODUCT: " + mostPopularProduct);
        System.out.println("");
        scanner.close();
    }
}