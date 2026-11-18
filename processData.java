import javax.swing.
    public class ProductFormComponentsUnitTest {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Product App - Q.2.2");
            frame.setSize(450, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
// 1. Label and Text Box for Customer Name[span_6](start_span)[span_6](end_span)
            JLabel lblName = new JLabel("Customer Name:");
            lblName.setBounds(30, 30, 120, 25);
            frame.add(lblName);
            JTextField txtCustomerName = new JTextField();
            txtCustomerName.setBounds(160, 30, 220, 25);
            frame.add(txtCustomerName);
// 2. Label and Combo Box for Product Name[span_7](start_span)[span_7](end_span)
            JLabel lblProduct = new JLabel("Select Product:");
            lblProduct.setBounds(30, 70, 120, 25);
            frame.add(lblProduct);
            String[] products = {
                    "Cozy Nights Monarch",
                    "Restonic Barbados",
                    "Sealy Phuket"
            };
            JComboBox<String> cmbProducts = new JComboBox<>(products);
            cmbProducts.setBounds(160, 70, 220, 25);
            frame.add(cmbProducts);
// 3. Label and Text Box for Product Price[span_8](start_span)[span_8](end_span)
            JLabel lblPrice = new JLabel("Enter Price:");
            lblPrice.setBounds(30, 110, 120, 25);
            frame.add(lblPrice);
            JTextField txtPrice = new JTextField();
            txtPrice.setBounds(160, 110, 220, 25);
            frame.add(txtPrice);
            frame.setVisible(true);
        }
    }


