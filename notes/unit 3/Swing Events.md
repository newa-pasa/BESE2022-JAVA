
### Common Events:

1. **ActionEvent:**
    - Commonly associated with buttons (`JButton`, `JMenuItem`, etc.).
    - Triggered when a user performs an action like clicking a button.
2. **ItemEvent:
    - Associated with toggle buttons (`JCheckBox`, `JRadioButton`, etc.).
    - Triggered when the state of the toggle button changes.
3. **FocusEvent:
    - Commonly used for components that can receive focus, like text fields (`JTextField`).
    - Triggered when a component gains or loses focus.
4. **KeyEvent:
    - Used for components that can receive keyboard input, like text components (`JTextField`, `JTextArea`).
    - Events include `keyPressed`, `keyReleased`, and `keyTyped`.
5. **MouseListener:**
    - Commonly used for components that can be interacted with using the mouse (e.g., `JButton`, `JPanel`).
    - Events include `mouseClicked`, `mousePressed`, `mouseReleased`, `mouseEntered`, and `mouseExited`.
6. **MouseMotionListener:
    - Similar to `MouseListener`, but provides additional events related to mouse motion.
    - Events include `mouseMoved` and `mouseDragged`.
7. **MouseWheelListener:
    - Used for components that respond to mouse wheel events (e.g., scrolling).
    - Events include `mouseWheelMoved`.
8. **ListSelectionEvent:
    - Associated with components like `JList`.
    - Triggered when the selection in the list changes.
9. **ActionListener:
    - Used with various components (not limited to buttons).
    - Commonly used for handling action events.
10. **ChangeListener:**
    - Associated with components that have a changing state, such as sliders (`JSlider`).
    - Triggered when the state of the component changes.

### Specific Events:

1. **TextEvent:
    - Associated with text components (`JTextField`, `JTextArea`) for text-related events.
2. **PopupMenuEvent:
    - Associated with `JPopupMenu`.
    - Triggered when the popup menu is canceled or will become invisible.
3. **TreeSelectionEvent:
    - Associated with `JTree`.
    - Triggered when the selection in the tree changes.
4. **TableColumnModelEvent:
    - Associated with `JTable`.
    - Triggered when there are changes to the column model.

## JButtons Events
In Swing, a button generates several events during its lifecycle, and the most common event associated with a button is the action event. Let's list the events and listeners related to Swing buttons:

### Events:

1. **Action Event:**
    - Triggered when the button is clicked or activated using the keyboard.
    - Typically used for handling button clicks.
    - Associated listener: `ActionListener`
2. **Item Event:**
    - Applicable to `JToggleButton` (toggle button) instances.
    - Triggered when the button's state changes (pressed or released).
    - Associated listener: `ItemListener`
3. **Mouse Events:
    - `MouseListener` events such as `mouseClicked`, `mousePressed`, `mouseReleased`, `mouseEntered`, and `mouseExited`.
    - Triggered by various mouse actions on the button.
4. **Focus Events:
    - `FocusListener` events such as `focusGained` and `focusLost`.
    - Triggered when the button gains or loses focus.
5. **Key Events:
    - `KeyListener` events such as `keyPressed`, `keyReleased`, and `keyTyped`.
    - Triggered when the button has keyboard focus and keys are pressed, released, or typed.

### Listeners:
1. **ActionListener:
    - Handles action events.
    - Typically used for button clicks.
    - Implemented methods: `actionPerformed(ActionEvent e)`
    ```java
    JButton myButton = new JButton("Click Me");
	myButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        // Handle button click
	        System.out.println("Button clicked!");
	    }
	});
```
    
2. **ItemListener:**
    - Handles item events (used for toggle buttons).
    - Implemented methods: `itemStateChanged(ItemEvent e)`
    ```java
    JToggleButton toggleButton = new JToggleButton("Toggle");
	toggleButton.addItemListener(new ItemListener() {
	    public void itemStateChanged(ItemEvent e) {
	        // Handle toggle state change
	        if (e.getStateChange() == ItemEvent.SELECTED) {
	            System.out.println("Toggle button selected");
	        } else {
	            System.out.println("Toggle button deselected");
	        }
	    }
	});
```
    
3. **MouseListener:**
    - Handles mouse events.
    - Implemented methods: `mouseClicked(MouseEvent e)`, `mousePressed(MouseEvent e)`, `mouseReleased(MouseEvent e)`, `mouseEntered(MouseEvent e)`, `mouseExited(MouseEvent e)`
    ```java
    JButton myButton = new JButton("Click Me");
	myButton.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent e) {
	        // Handle mouse click
	        System.out.println("Mouse clicked!");
	    }
	});
```
    
4. **FocusListener:**
    - Handles focus events.
    - Implemented methods: `focusGained(FocusEvent e)`, `focusLost(FocusEvent e)`
    ```java
    JButton myButton = new JButton("Click Me");
	myButton.addFocusListener(new FocusListener() {
	    public void focusGained(FocusEvent e) {
	        // Handle focus gained
	        System.out.println("Focus gained!");
	    }
	
	    public void focusLost(FocusEvent e) {
	        // Handle focus lost
	        System.out.println("Focus lost!");
	    }
	});
```
    
5. **KeyListener:**
    - Handles key events.
    - Implemented methods: `keyPressed(KeyEvent e)`, `keyReleased(KeyEvent e)`, `keyTyped(KeyEvent e)`
    ```java 
    JButton myButton = new JButton("Click Me");
	myButton.addKeyListener(new KeyAdapter() {
	    public void keyPressed(KeyEvent e) {
	        // Handle key press
	        System.out.println("Key pressed: " + e.getKeyChar());
	    }
	});
```
   
These events and listeners provide a comprehensive way to interact with and respond to user actions on Swing buttons. Depending on your application's requirements, you can choose the appropriate events and listeners to handle user interactions effectively.