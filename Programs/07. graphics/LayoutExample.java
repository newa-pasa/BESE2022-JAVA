import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Using BorderLayout
        frame.setLayout(new BorderLayout());

        JButton btnNorth = new JButton("North");
        frame.add(btnNorth, BorderLayout.NORTH);

        JButton btnSouth = new JButton("South");
        frame.add(btnSouth, BorderLayout.SOUTH);

        JButton btnCenter = new JButton("West");
        frame.add(btnCenter, BorderLayout.WEST);

        // Using GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 2));

        JButton btnGrid1 = new JButton("Grid 1");
        gridPanel.add(btnGrid1);

        JButton btnGrid2 = new JButton("Grid 2");
        gridPanel.add(btnGrid2);

        JButton btnGrid3 = new JButton("Grid 3");
        gridPanel.add(btnGrid3);

        JButton btnGrid4 = new JButton("Grid 4");
        gridPanel.add(btnGrid4);

        frame.add(gridPanel, BorderLayout.CENTER);


        JPanel panel = new JPanel();
        JButton homeBtn = new JButton("Home");
        panel.add(homeBtn);
        frame.add(panel, BorderLayout.NORTH);


        // Set the menu bar for the frame
        frame.setJMenuBar(createMenu());


        frame.setVisible(true);
    }

    private static JMenuBar createMenu() {

        JMenuBar menuBar = new JMenuBar();

        // Create File menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items for File menu
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to File menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Separator between Save and Exit
        fileMenu.add(exitItem);

        // Create Edit menu
        JMenu editMenu = new JMenu("Edit");

        // Create submenu for Edit menu
        JMenu formatSubMenu = new JMenu("Format");

        // Create menu items for Format submenu
        JMenuItem boldItem = new JMenuItem("Bold");
        JMenuItem italicItem = new JMenuItem("Italic");

        // Add menu items to Format submenu
        formatSubMenu.add(boldItem);
        formatSubMenu.add(italicItem);

        // Add Format submenu to Edit menu
        editMenu.add(formatSubMenu);

        // Add File and Edit menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

       
        // ActionListener for Exit menu item
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return menuBar;
    }
}