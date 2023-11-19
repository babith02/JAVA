import java.awt.*;
import java.awt.event.*;

class EmployeeRegistrationForm extends Frame {
    Label lblTitle, lblName, lblSupervisor, lblAge, lblGender, lblDepartment, lblExperience, lblAddress;
    TextField txtName, txtSupervisor, txtAge, txtExperience;
    TextArea txtAddress;
    Checkbox checkMale, checkFemale;
    CheckboxGroup cbg;
    Choice department;
    Button btnSave, btnClear;

    public EmployeeRegistrationForm() {
        super("Employee Registration Form");
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(240, 240, 240);
        setBackground(formColor);

        Font titleFont = new Font("Arial", Font.BOLD, 25);
        Font labelFont = new Font("Arial", Font.PLAIN, 18);
        Font textFont = new Font("Arial", Font.PLAIN, 15);

        lblTitle = new Label("Employee Registration Form");
        lblTitle.setBounds(200, 40, 400, 50);
        lblTitle.setFont(titleFont);
        lblTitle.setForeground(Color.BLUE);
        add(lblTitle);

        lblName = new Label("Full Name");
        lblName.setBounds(100, 120, 200, 30);
        lblName.setFont(labelFont);
        add(lblName);

        txtName = new TextField();
        txtName.setBounds(300, 120, 400, 30);
        txtName.setFont(textFont);
        add(txtName);

        lblSupervisor = new Label("Supervisor");
        lblSupervisor.setBounds(100, 170, 200, 30);
        lblSupervisor.setFont(labelFont);
        add(lblSupervisor);

        txtSupervisor = new TextField();
        txtSupervisor.setBounds(300, 170, 400, 30);
        txtSupervisor.setFont(textFont);
        add(txtSupervisor);

        lblAge = new Label("Age");
        lblAge.setBounds(100, 220, 200, 30);
        lblAge.setFont(labelFont);
        add(lblAge);

        txtAge = new TextField();
        txtAge.setBounds(300, 220, 400, 30);
        txtAge.setFont(textFont);
        add(txtAge);

        lblGender = new Label("Gender");
        lblGender.setBounds(100, 270, 200, 30);
        lblGender.setFont(labelFont);
        add(lblGender);

        cbg = new CheckboxGroup();

        checkMale = new Checkbox("Male", cbg, true);
        checkMale.setBounds(300, 270, 100, 30);
        checkMale.setFont(labelFont);
        add(checkMale);

        checkFemale = new Checkbox("Female", cbg, false);
        checkFemale.setBounds(400, 270, 100, 30);
        checkFemale.setFont(labelFont);
        add(checkFemale);

        lblDepartment = new Label("Department");
        lblDepartment.setBounds(100, 320, 200, 30);
        lblDepartment.setFont(labelFont);
        add(lblDepartment);

        department = new Choice();
        department.setFont(labelFont);
        department.setBounds(300, 320, 400, 50);
        department.add("HR");
        department.add("Finance");
        department.add("IT");
        department.add("Marketing");
        department.add("Operations");
        add(department);

        lblExperience = new Label("Years of Experience");
        lblExperience.setBounds(100, 370, 200, 30);
        lblExperience.setFont(labelFont);
        add(lblExperience);

        txtExperience = new TextField();
        txtExperience.setBounds(300, 370, 400, 30);
        txtExperience.setFont(textFont);
        add(txtExperience);

        lblAddress = new Label("Address");
        lblAddress.setBounds(100, 420, 200, 30);
        lblAddress.setFont(labelFont);
        add(lblAddress);

        txtAddress = new TextArea();
        txtAddress.setBounds(300, 410, 350, 100);
        txtAddress.setFont(textFont);
        add(txtAddress);

        btnSave = new Button("Register Employee");
        btnSave.setBounds(250, 550, 200, 30);
        btnSave.setFont(labelFont);
        btnSave.setBackground(new Color(30, 144, 255));
        btnSave.setForeground(Color.WHITE);
        add(btnSave);

        btnClear = new Button("Clear All");
        btnClear.setBounds(500, 550, 200, 30);
        btnClear.setFont(labelFont);
        btnClear.setBackground(new Color(255, 69, 0));
        btnClear.setForeground(Color.WHITE);
        add(btnClear);

        // Close Button Code
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeRegistrationForm empForm = new EmployeeRegistrationForm();
    }
}
