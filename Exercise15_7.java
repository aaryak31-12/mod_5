
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_7 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // creating a pane to hold the circle
        Pane pane = new Pane();

        // creating a circle at position (150, 100) with radius 50
        Circle circle = new Circle(150, 100, 50);

        // setting the initial circle color to white
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // adding the circle to the pane
        pane.getChildren().add(circle);

        // turning  circle black when mouse button is pressed
        circle.setOnMousePressed(e -> 
            circle.setFill(Color.BLACK)
        );

        //turning circle white when mouse button is released
        circle.setOnMouseReleased(e -> 
            circle.setFill(Color.WHITE)
        );

        // creating the scene
        Scene scene = new Scene(pane, 300, 200);

        //setting the title and display the window
        primaryStage.setTitle("Exercise 15.7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
