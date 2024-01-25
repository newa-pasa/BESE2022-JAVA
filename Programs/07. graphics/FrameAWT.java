import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameAWT {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Frame Example");

        // Create and set layout manager (default is BorderLayout)

        // Create components
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button submitButton = new Button("Submit");
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);

        // Set layout for the frame (default is BorderLayout)
        frame.setLayout(null);  // Using null layout for simplicity

        // Set positions and sizes for components
        label.setBounds(50, 50, 120, 20);
        textField.setBounds(180, 50, 150, 20);
        submitButton.setBounds(180, 80, 80, 30);
        maleCheckbox.setBounds(180, 120, 60, 20);
        femaleCheckbox.setBounds(240, 120, 80, 20);

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(submitButton);
        frame.add(maleCheckbox);
        frame.add(femaleCheckbox);

        // Add ActionListener to the Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String gender = maleCheckbox.getState() ? "Male" : "Female";
                System.out.println("Name: " + name + ", Gender: " + gender);
            }
        });

        // Add WindowListener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set frame size and make it visible
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
