### Windows:

1. **JFrame:**
    
    - A top-level container representing the main window of a Swing application.
    - It can have a title, borders, menus, and various components.
2. **JDialog:**
    
    - A pop-up window used for dialog boxes and secondary interactions.
    - Typically used for input, information, or messages.

### Dialogs:

1. **JOptionPane:**
    - A versatile dialog that can be used to display messages, request input, or make simple choices.
    - It can include buttons, input fields, and icons.
2. **JFileChooser:**
    - A dialog for selecting files or directories.
    - It allows users to browse and choose files or directories from the file system.
3. **JColorChooser:**
    - A dialog for selecting colors.
    - It provides a color wheel, sliders, and options to choose colors.
4. **JFileChooser:**
    - A dialog for selecting fonts.
    - It allows users to choose a font family, style, and size.
5. **JInputDialog:**
    - A dialog for receiving input from the user.
    - It can be used to get text input, numeric input, or choices from the user.
6. **JMessageDialog:**
    - A simple dialog for displaying messages.
    - It can be used to show information, warnings, errors, or ask for confirmation.
7. **JProgressBar:**
    - A dialog that shows the progress of a task.
    - It's often used for lengthy operations to keep the user informed.
8. **JOptionPane:**
    - A dialog for displaying a list of items for the user to choose from.
    - It allows single or multiple item selection.
9. **JScrollPane:**
    - A dialog that provides a scrollable view of another component.
    - It's useful when the content is larger than the visible area.
10. **JTabbedPane:**
    - A dialog that allows multiple components to be displayed within a single container.
    - It uses tabs to switch between different components.
11. **JWindow:**
    - Similar to a JFrame but lacks the title bar and other decorations.
    - Used for creating lightweight, non-focusable windows.



# Properties
### JFrame:
|Property|Description|
|---|---|
|Title|Title of the JFrame window.|
|Size|Dimensions of the JFrame.|
|Visibility|Whether the JFrame is visible or not.|
|Layout Manager|Specifies the layout manager used for components.|
|Closing Behavior|Defines the behavior when the close button is clicked.|

### JDialog:
|Property|Description|
|---|---|
|Title|Title of the JDialog window.|
|Size|Dimensions of the JDialog.|
|Visibility|Whether the JDialog is visible or not.|
|Layout Manager|Specifies the layout manager used for components.|
|Modal|Indicates whether the dialog is modal or not.|
|Closing Behavior|Defines the behavior when the close button is clicked.|

### JOptionPane:
|Property|Description|
|---|---|
|Message|Text message to be displayed.|
|Icon|Icon (information, warning, error, etc.).|
|Option Type|Type of options to be displayed (OK, Yes/No, etc.).|
|Option Choices|Array of choices for the user to select from.|
|Initial Selection|Default selection when multiple choices are available.|

### JFileChooser:
|Property|Description|
|---|---|
|FileSelectionMode|Selection mode for files or directories (single or multiple).|
|FileFilter|Filters files based on file type or criteria.|
|Current Directory|The initial directory shown in the file chooser.|

### JColorChooser:
|Property|Description|
|---|---|
|Initial Color|Default color selected in the chooser.|

### JFontChooser:
|Property|Description|
|---|---|
|Initial Font|Default font selected in the chooser.|

### JInputDialog:
|Property|Description|
|---|---|
|Message|Text message prompting the user for input.|
|Initial Value|Default value in the input field.|

### JMessageDialog:
|Property|Description|
|---|---|
|Message|Text message to be displayed.|
|Icon|Icon (information, warning, error, etc.).|
|Dialog Type|Type of dialog (information, warning, error, etc.).|
|Option Type|Type of options to be displayed (OK, Yes/No, etc.).|

### JProgressBar:
|Property|Description|
|---|---|
|Value|Current progress value.|
|Minimum|Minimum value of the progress.|
|Maximum|Maximum value of the progress.|

### JComboBox:
|Property|Description|
|---|---|
|Items|List of items displayed in the combo box.|
|Selected Item|Currently selected item.|

### JScrollPane:
|Property|Description|
|---|---|
|Viewport View|The component displayed in the scroll pane.|
|Horizontal/Vertical Scroll Bar Policy|Specifies when scroll bars should appear (always, never, as needed).|

### JTabbedPane:
|Property|Description|
|---|---|
|Tab Placement|Location of the tabs (top, bottom, left, right).|
|Tab Components|Components associated with each tab.|

### JWindow:
|Property|Description|
|---|---|
|Title|Title of the JWindow.|
|Size|Dimensions of the JWindow.|
|Visibility|Whether the JWindow is visible or not.|
|Layout Manager|Specifies the layout manager used for components.|


### Swing Components (Excluding Dialogs and Windows):

|Component|Description|Properties|
|---|---|---|
|**JButton**|A clickable button.|`text`, `icon`, `enabled`, `action listener`|
|**JLabel**|Non-editable text display.|`text`, `icon`, `alignment`|
|**JTextField**|Single-line editable text input.|`text`, `columns`, `enabled`, `action listener`|
|**JTextArea**|Multi-line editable text input.|`text`, `rows`, `columns`, `enabled`, `action listener`|
|**JCheckBox**|A checkbox for binary choices.|`text`, `selected`, `enabled`, `item listener`|
|**JRadioButton**|A radio button for exclusive choices.|`text`, `selected`, `enabled`, `item listener`|
|**JComboBox**|A drop-down menu for selecting one option.|`items`, `selected item`, `enabled`, `action listener`|
|**JList**|A list of items.|`items`, `selected items`, `enabled`, `list selection listener`|
|**JScrollPane**|A scrollable view of a component.|`viewport view`, `horizontal/vertical scroll bars`, `enabled`|
|**JTable**|A table for displaying data.|`table model`, `table column model`, `enabled`, `table selection listener`|
|**JSlider**|A slider for selecting a value within a range.|`min`, `max`, `value`, `major tick spacing`, `minor tick spacing`, `enabled`, `change listener`|
|**JProgressBar**|A progress bar for showing progress of a task.|`value`, `min`, `max`, `string painting`, `enabled`|
|**JMenuBar**|A horizontal menu bar.|`menus`|
|**JMenu**|A drop-down menu.|`items`, `submenus`, `enabled`|
|**JMenuItem**|An item within a menu.|`text`, `icon`, `shortcut`, `enabled`, `action listener`|
|**JToolBar**|A horizontal or vertical bar with buttons.|`buttons`, `orientation`, `floatable`, `enabled`|
|**JFileChooser**|A dialog for selecting files or directories.|`file selection mode`, `file filter`, `current directory`, `enabled`|
|**JColorChooser**|A dialog for selecting colors.|`initial color`, `enabled`|
|**JOptionPane**|A versatile dialog for messages and input.|`message`, `icon`, `option type`, `option choices`, `initial selection`, `enabled`|
|**JDesktopPane**|A container for managing internal frames.|`internal frames`, `enabled`|
|**JInternalFrame**|A frame that exists within another frame.|`title`, `resizable`, `closable`, `maximizable`, `iconifiable`, `enabled`|
|**JSplitPane**|A container with two components separated by a divider.|`left component`, `right component`, `orientation`, `divider location`, `enabled`|
|**JPanel**|A generic container for organizing components.|`layout manager`, `components`, `enabled`|
|**JTextField**|A text field for entering/editing single-line text.|`text`, `columns`, `enabled`, `action listener`|
|**JPasswordField**|A text field for entering passwords.|`text`, `columns`, `enabled`, `action listener`|
|**JFormattedTextField**|A text field with a specified format.|`value`, `format`, `columns`, `enabled`, `action listener`|
|**JToggleButton**|A button that can be in selected or deselected state.|`text`, `icon`, `selected`, `enabled`, `action listener`|
|**JTree**|A tree for displaying hierarchical data.|`tree model`, `tree cell renderer`, `tree selection model`, `enabled`|
|**JSpinner**|A component for selecting numeric values.|`value`, `model`, `editor`, `enabled`, `change listener`|
|**JEditorPane**|A text component for displaying/editing styled text or HTML.|`text`, `content type`, `styled document`, `enabled`|
|**JTextPane**|A text component with support for styled text.|`text`, `styled document`, `enabled`|
|**JScrollPane**|A scrollable view of a text component.|`text component`, `horizontal/vertical scroll bars`, `enabled`|
|**JTextPane**|A text area for entering/editing multiline text.|`text`, `styled document`, `enabled`|
|**JScrollPane**|A scrollable view of a text area.|`text area`, `horizontal/vertical scroll bars`, `enabled`|


### JButton:

|Property|Description|
|---|---|
|`text`|The label or text displayed on the button.|
|`icon`|An optional icon displayed on the button.|
|`enabled`|Indicates whether the button is enabled.|
|`action listener`|Responds to button-click events.|

### JLabel:

|Property|Description|
|---|---|
|`text`|The text content displayed by the label.|
|`icon`|An optional icon displayed by the label.|
|`alignment`|Specifies the alignment of text and icon within the label.|

### JTextField:

|Property|Description|
|---|---|
|`text`|The text content of the field.|
|`columns`|The number of columns (characters) visible in the field.|
|`enabled`|Indicates whether the text field is enabled.|
|`action listener`|Responds to text changes or pressing Enter.|

### JTextArea:

|Property|Description|
|---|---|
|`text`|The text content of the area.|
|`rows`, `columns`|The number of rows and columns in the area.|
|`enabled`|Indicates whether the text area is enabled.|
|`action listener`|Responds to text changes.|

### JCheckBox:

|Property|Description|
|---|---|
|`text`|The label text for the checkbox.|
|`selected`|Indicates whether the checkbox is selected.|
|`enabled`|Indicates whether the checkbox is enabled.|
|`item listener`|Responds to checkbox state changes.|

### JRadioButton:

|Property|Description|
|---|---|
|`text`|The label text for the radio button.|
|`selected`|Indicates whether the radio button is selected.|
|`enabled`|Indicates whether the radio button is enabled.|
|`item listener`|Responds to radio button state changes.|

### JComboBox:

|Property|Description|
|---|---|
|`items`|List of items displayed in the drop-down.|
|`selected item`|The currently selected item.|
|`enabled`|Indicates whether the combo box is enabled.|
|`action listener`|Responds to item selection changes.|

### JList:

|Property|Description|
|---|---|
|`items`|List of items displayed in the list.|
|`selected items`|The currently selected items.|
|`enabled`|Indicates whether the list is enabled.|
|`list selection listener`|Responds to list selection changes.|

### JScrollPane:

|Property|Description|
|---|---|
|`viewport view`|The component displayed in the scroll pane.|
|`horizontal/vertical scroll bars`|Control visibility of scroll bars.|
|`enabled`|Indicates whether the scroll pane is enabled.|

### JTable:

|Property|Description|
|---|---|
|`table model`|Manages the data displayed in the table.|
|`table column model`|Manages the columns of the table.|
|`enabled`|Indicates whether the table is enabled.|
|`table selection listener`|Responds to table selection changes.|

### JSlider:

|Property|Description|
|---|---|
|`min`, `max`|Minimum and maximum values of the slider.|
|`value`|The current value selected on the slider.|
|`major tick spacing`, `minor tick spacing`|Spacing between ticks.|
|`enabled`|Indicates whether the slider is enabled.|
|`change listener`|Responds to value changes.|

### JProgressBar:

|Property|Description|
|---|---|
|`value`|Current progress value.|
|`min`, `max`|Minimum and maximum values of the progress.|
|`string painting`|Displays a text string in the progress bar.|
|`enabled`|Indicates whether the progress bar is enabled.|

### JMenuBar:

|Property|Description|
|---|---|
|`menus`|The menus added to the menu bar.|

### JMenu:

|Property|Description|
|---|---|
|`items`|The items (menu items or submenus) added to the menu.|
|`submenus`|The submenus added to the menu.|
|`enabled`|Indicates whether the menu is enabled.|

### JToolBar:

|Property|Description|
|---|---|
|`buttons`|The buttons added to the tool bar.|
|`orientation`|The orientation of the tool bar (horizontal or vertical).|
|`floatable`|Indicates whether the tool bar is floatable.|
|`enabled`|Indicates whether the tool bar is enabled.|

### JFileChooser:

|Property|Description|
|---|---|
|`file selection mode`|Selection mode for files or directories (single or multiple).|
|`file filter`|Filters files based on file type or criteria.|
|`current directory`|The initial directory shown in the file chooser.|
|`enabled`|Indicates whether the file chooser is enabled.|

### JColorChooser:

|Property|Description|
|---|---|
|`initial color`|Default color selected in the chooser.|
|`enabled`|Indicates whether the color chooser is enabled.|

