import javax.swing.*;

public class ProductFormComponents {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Product App - Q.2.2");
            frame.setSize(450, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
// Make sure that you label and text box for customer name.
            JLabel lblName = new JLabel("Customer Name:");
            lblName.setBounds(30, 30, 120, 25);
            frame.add(lblName);
            JTextField txtCustomerName = new JTextField();
            txtCustomerName.setBounds(160, 30, 220, 25);
            frame.add(txtCustomerName);
//  Ensure it has label and combo box for product name.
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
// 3. The label and text box for product price.
            JLabel lblPrice = new JLabel("Enter Price:");
            lblPrice.setBounds(30, 110, 120, 25);
            frame.add(lblPrice);
            JTextField txtPrice = new JTextField();
            txtPrice.setBounds(160, 110, 220, 25);
            frame.add(txtPrice);
            frame.setVisible(true);
        }
    }


