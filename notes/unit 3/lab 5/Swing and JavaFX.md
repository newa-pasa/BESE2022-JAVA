## OBJECTIVES
- Use different layouts in Swing and JavaFX 
- Learn different GUI controls in Swing and JavaFX 
- Learn about event handling and listener Interfaces

### Swing
#### Program 1: School Management System

1. **Student Registration Form:**
   - Create a JFrame to serve as the main window and needs to contain two Buttons 
	   - Register: Needs to Open Registration Form in separate JFrame
	   - View: Needs to Open Student List in separate JFrame
   - Create a separate class to store Student record
   - Create a List of Student in the main window, and reference of this list needs to be passed on both Registration form and View window 

2. Design a Student Registration Form with the following fields:
     - Student ID (JLabel + JTextField)
     - Student Name (JLabel + JTextField)
     - Gender (JLabel + JRadioButton for Male/Female)
     - Courses (JLabel + JCheckBox for multiple courses)
     - Department (JLabel + JComboBox with multiple department options)
     - Register Button (JButton)

3. **Layouts:**
   - Use different layout managers for organizing components within the form:
     - Top: BorderLayout (for the title or header)
     - Center: GridLayout (for organizing the form fields)
     - Bottom: FlowLayout (for the Register button)

4. **Event Handling:**
   - Implement event handling for the Register button.
   - On button click, validate the input fields and add the student details to a list.
   - Display a confirmation dialog on successful registration.

5. **List of Registered Students:**
   - Create another JFrame to display a list of registered students.
   - Use a JList to display the student names.
   - Add a "Refresh" button to update the list.

6. **Layout for Student List:**
   - Use BorderLayout for the main layout.
   - Place the JList in the Center.
   - Place the Refresh button at the bottom using FlowLayout.


### JavaFX
#### Program 1:
Write a JavaFX program to create a window and add a `TabPane` with 3 tabs. The layout should look as below. Each tab should contain the application build in exercise below 
![[Pasted image 20240206003442.png]]

#### Program 2:
Create a BMI calculator app that allows users to enter their weight and height and whether they are entering these values in English or metric units, then calculates and displays the user’s body mass index. The app should also display the following information from the Department of Health and Human Services/National Institutes of Health so that users can evaluate their BMIs:

BMI VALUES

| Underweight | less than 18.5 |
| ---- | ---- |
| Normal | between 18.5 and 24.9 |
| Overweight | between 25 and 29.9 |
| Obese | 30 or greater |
The formula for calculating the BMI is

$$
	BMI = \frac{weightInKilograms}{heightInMeters * heightInMeters}
$$
So the screen should something like this
![[Pasted image 20240206005517.png]]

#### Program 3:
Create a Simple Interest calculator app that allows users to enter Principal, time in year and annual interest rate and display the calculated interest. 
![[Pasted image 20240206005536.png]]
Formular for simple interet
$$
Simple Interest(I) = \frac{Principal(P) * TimeInYear(T) * AnnualInterestRate(R)}{100}
$$

#### Program 4:
Find two images of famous landmarks using google search. Create a simple app to arrange those images and their description as below 
![[Pasted image 20240206005551.png]]

### Sample Code

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

   public static void main(String[] args) {
      Application.launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {

      Scene scene = new Scene(createBorderPane(), 250, 200);
      stage.setTitle("Layout Demo");
      stage.setScene(scene);
      stage.show();
   }


   public BorderPane createBorderPane() {

      BorderPane borderPane = new BorderPane();

      MenuBar menuBar = new MenuBar();
      Menu fileMenu = new Menu("File");
      fileMenu.getItems().addAll(new MenuItem("New"),
         new SeparatorMenuItem(), new MenuItem("Open"),
         new MenuItem("Save"), new MenuItem("Save As..."),
         new SeparatorMenuItem(), new MenuItem("Exit"));
      Menu editMenu = new Menu("Edit");
      editMenu.getItems().addAll(new MenuItem("Undo"),
         new MenuItem("Redo"), new MenuItem("Cut"),
         new MenuItem("Copy"), new MenuItem("Paste"),
         new SeparatorMenuItem(), new MenuItem("Search/Replace"));
      Menu helpMenu = new Menu("Help");
      helpMenu.getItems().addAll(new MenuItem("Help Contents"),
         new SeparatorMenuItem(), new MenuItem("About..."));
      menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

      ToolBar toolbar = new ToolBar(new Button("New"),
         new Button("Open"), new Separator(), new Button("Cut"),
         new Button("Copy"), new Button("Paste"));

      VBox vbox = new VBox();
      vbox.getChildren().addAll(menuBar, toolbar);

      TreeItem<String> ti = new TreeItem<>("Projects");
      ti.getChildren().addAll(
         new TreeItem<String>("Project 1"),
         new TreeItem<String>("Project 2"),
         new TreeItem<String>("Project 3"),
         new TreeItem<String>("Project 4"));
      TreeView<String> tv = new TreeView<String>(ti);

      TabPane tabPaneLeft = new TabPane();
      Tab tab1 = new Tab("Project List");
      tab1.setContent(tv);
      tabPaneLeft.getTabs().addAll(tab1, new Tab("Explorer"));

      TabPane tabPaneRight = new TabPane();
      tabPaneRight.getTabs().addAll(new Tab("Outline"),
         new Tab("Task List"));

      borderPane.setTop(vbox);
      borderPane.setLeft(tabPaneLeft);
      borderPane.setCenter(new TextArea());
      borderPane.setRight(tabPaneRight);
      borderPane.setBottom(new Label("Status text: Borderpane demo"));

     return borderPane;
   }
}
```
### Homework - Optional 

[Lab Exercise: JavaFX (umn.edu)](https://www.d.umn.edu/~tcolburn/cs2511/javalabs/javaFX/javaFX.xhtml)
