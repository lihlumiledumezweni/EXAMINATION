public class Product implements IProduct {
    private String[] productNames;
    private int[][] salesData;

    // Initializes product names and 2D sales data array.
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public float GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            count += salesData[i].length;
        }
        return (float) (count == 0 ? 0.0 : (double) total / count);
    }

    @Override
    public String GetMostPopularProduct() {
        int maxTotal = -1;
        String mostPopular = "";

        for (int i = 0; i < productNames.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                mostPopular = productNames[i] + " (" + maxTotal + ")";
            }
        }
        return mostPopular;
    }
}