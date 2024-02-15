In Java Swing, layouts are used to arrange and manage the placement of components within a container. Different layouts provide different ways of organizing and displaying components, ensuring proper alignment and resizing as the user interacts with the application. Swing doesn't has its own layout manager instead it uses AWT layout manager. Here are some commonly used AWT layouts:

1. **FlowLayout:**
    - Components are arranged in a left-to-right flow, and new components are added to the right.
    - It wraps to the next line when the container's width is reached.
2. **BorderLayout:**
    - Components are arranged in five regions: North, South, East, West, and Center.
    - The Center region takes up the remaining space and is the default location.
3. **GridLayout:**
    - Components are arranged in a grid, with a fixed number of rows and columns.
    - All components have the same size within the container.
4. **GridBagLayout:**
    - Provides a flexible grid where components can span multiple rows and columns.
    - Allows fine control over component placement and sizing.
5. **BoxLayout:**
    - Arranges components either in a single row or column.
    - Supports both X_AXIS (horizontal) and Y_AXIS (vertical) orientations.
6. **CardLayout:**
    - Manages a stack of components, showing only one at a time.
    - Useful for creating wizard-style interfaces or multi-panel forms.
7. **FlowLayout:**
    - Similar to FlowLayout but allows components to be centered within the container.
8. **GroupLayout:**
    - Introduced in Java SE 6, GroupLayout is a more sophisticated layout manager.
    - It is designed for complex user interfaces and supports both horizontal and vertical grouping.
9. **SpringLayout:**
    - A flexible layout that allows components to be arranged based on spring constraints.
    - Useful for specifying relationships between components.

```java 
import javax.swing.*;
import java.awt.*;

  

public class LayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Layout Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
  
        // Using BorderLayout
        // frame.setLayout(new FlowLayout());
        frame.setLayout(new BorderLayout());

        JButton btnNorth = new JButton("North");
        frame.add(btnNorth, BorderLayout.NORTH);

        JButton btnSouth = new JButton("South");
        frame.add(btnSouth, BorderLayout.SOUTH);

        JButton btnCenter = new JButton("Center");
        frame.add(btnCenter, BorderLayout.CENTER);

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

        frame.add(gridPanel, BorderLayout.EAST);
        frame.setVisible(true);

    }

}

```