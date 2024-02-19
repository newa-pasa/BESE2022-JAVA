import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FrameJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Example");

        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button submitButton = new Button("Submit");

        RadioButton maleRadioButton = new RadioButton("Male");
        RadioButton femaleRadioButton = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(genderGroup);
        femaleRadioButton.setToggleGroup(genderGroup);

        submitButton.setOnAction(e -> {
            String name = textField.getText();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";
            System.out.println("Name: " + name + ", Gender: " + gender);
        });

        HBox layout = new HBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(label, textField, maleRadioButton, femaleRadioButton, submitButton);

        Scene scene = new Scene(layout, 250, 200);
        stage.setScene(scene);

        stage.show();
    }
}
