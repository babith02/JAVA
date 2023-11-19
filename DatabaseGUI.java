import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DatabaseGUI extends JFrame {
    private JTextField idField, nameField, ageField;
    private JButton insertButton, viewButton, updateButton;

    public DatabaseGUI() {
        setTitle("Database GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        idField = new JTextField(10);
        nameField = new JTextField(10);
        ageField = new JTextField(10);

        insertButton = new JButton("Insert");
        viewButton = new JButton("View");
        updateButton = new JButton("Update");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("ID:"), gbc);
        gbc.gridx = 1;
        add(idField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        add(ageField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(insertButton, gbc);
        gbc.gridx = 1;
        add(viewButton, gbc);
        gbc.gridx = 2;
        add(updateButton, gbc);

        insertButton.addActionListener(e -> insertData());
        viewButton.addActionListener(e -> viewData());
        updateButton.addActionListener(e -> updateData());
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/db?user=root&password=root");
    }

    private void insertData() {
        try (Connection connection = getConnection()) {
            String query = "INSERT INTO forms (ID, Name, Age) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(idField.getText()));
                pstmt.setString(2, nameField.getText());
                pstmt.setInt(3, Integer.parseInt(ageField.getText()));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data inserted successfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting data: " + ex.getMessage());
        }
    }
      private void viewData() {
    try (Connection connection = getConnection()) {
        String query = "SELECT * FROM forms";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            StringBuilder result = new StringBuilder(String.format("%-5s%-20s%-5s\n", "ID", "Name", "Age"));
            while (rs.next()) {
                result.append(String.format("%-5d%-20s%-5d\n", rs.getInt("ID"), rs.getString("Name"), rs.getInt("Age")));
            }
            JOptionPane.showMessageDialog(this, result.toString());
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error viewing data: " + ex.getMessage());
    }
}


    /*private void viewData() {
        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM forms";
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                StringBuilder result = new StringBuilder("ID\t\tName\t\tAge\n");
                while (rs.next()) {
                    result.append(rs.getInt("ID")).append("\t\t").append(rs.getString("Name")).append("\t\t").append(rs.getInt("Age")).append("\n");
                }
                JOptionPane.showMessageDialog(this, result.toString());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error viewing data: " + ex.getMessage());
        }
    }*/

    private void updateData() {
        try (Connection connection = getConnection()) {
            String query = "UPDATE forms SET Name = ?, Age = ? WHERE ID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setString(1, nameField.getText());
                pstmt.setInt(2, Integer.parseInt(ageField.getText()));
                pstmt.setInt(3, Integer.parseInt(idField.getText()));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data updated successfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating data: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DatabaseGUI().setVisible(true));
    }
}
