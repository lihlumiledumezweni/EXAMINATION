public class PrintProduct {
    private IProduct product;
    // The constructor injects the IProduct dependency.
    public PrintProduct(IProduct product) {
        this.product = product;
    }
    // This method prints total product sales.
    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.getClass());
    }
    // Instructs to print average product sales.
    public void printAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
    }
    // Prints the most popular product sale.
    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
    // Combined method to generate and display the report.
    public void printReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("");
        printTotalSales();
        printAverageSales();
        printMostPopularProduct();
        System.out.println("");
    }
}