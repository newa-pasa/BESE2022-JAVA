import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Frame Example");

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField();
        textField.setSize(150, 20);
        JButton submitButton = new JButton("Submit");

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                System.out.println("Name: " + name + ", Gender: " + gender);
            }
        });

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(textField);
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);
        frame.add(submitButton);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
