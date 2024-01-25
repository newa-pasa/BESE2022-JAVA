In JavaFX, layout managers are not explicitly used as in AWT or Swing. Instead, JavaFX employs a system of layout panes that automatically manage the positioning and resizing of UI elements. Each layout pane represents a different layout strategy.

Here are some common layout panes in JavaFX:

1. **VBox:**
    
    - Vertically stacks its children in a single column.
2. **HBox:**
    
    - Horizontally stacks its children in a single row.
3. **BorderPane:**
    
    - Divides its layout area into five regions: top, bottom, left, right, and center.
4. **GridPane:**
    
    - Places its children in a grid of rows and columns.
5. **StackPane:**
    
    - Stacks its children on top of each other, allowing one child to be visible at a time.
6. **AnchorPane:**
    
    - Anchors its children to the top, bottom, left, or right of the layout area.
7. **FlowPane:**
    
    - Similar to VBox and HBox but allows children to flow to the next row or column if space is insufficient.

Here's an example demonstrating the use of `VBox` in JavaFX:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXVBoxExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Create a VBox
        VBox vbox = new VBox();
        
        // Add buttons to the VBox
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        
        vbox.getChildren().addAll(button1, button2, button3);
        
        // Create a scene and set it on the stage
        Scene scene = new Scene(vbox, 300, 150);
        stage.setScene(scene);
        
        // Set stage title and show it
        stage.setTitle("JavaFX VBox Example");
        stage.show();
    }
}

```