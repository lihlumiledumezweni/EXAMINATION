public class ProductCalculations implements IProductCalculations {
    private double price;

    // Constructor to initialize the product price
    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * 0.15; // 15% VAT calculation
    }

    @Override
    public double GetCommission() {
        return price * 0.05; // 5% Commission calculation
    }

    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission(); // Total Sale Amount
    }
}