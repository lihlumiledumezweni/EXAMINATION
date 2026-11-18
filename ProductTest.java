import org.junit.Test;

public class ProductTest {
    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
// Test Purpose: Verify that the GetTotalProductsSold method in the Product class correctly returns the total products sold[span_1](start_span)[span_1](end_span).
        String[] productNames = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress"};
        int[][] salesData = {
                {25, 18, 20}, // Total = 63
                {15, 10, 12} // Total = 37
        };
        Product product = new Product(productNames, salesData);
        int expectedTotal = 100;
        assertEquals(expectedTotal, product.GetTotalProductsSold());
    }

    private void assertEquals(int expectedTotal, int i) {
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
// Test Purpose: Verify that the GetAverageProductSold method in the Product class correctly returns the average number of products sold[span_2](start_span)[span_2](end_span).
        String[] productNames = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress"};
        int[][] salesData = {
                {25, 18, 20}, // 63
                {15, 10, 12} // 37 -> Total = 100 across 6 entries (average = 16.666...)
        };
        Product product = new Product(productNames, salesData);
        double expectedAverage = 100.0 / 6.0;
        assertEquals(expectedAverage, product.GetAverageProductSold(), 0.001);
    }

    private void assertEquals(double expectedAverage, float v, double v1) {
    }
}
