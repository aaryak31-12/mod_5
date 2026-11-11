
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.beans.InvalidationListener;

public class Exercise16_17 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // creating text and set its font
        Text text = new Text("Show Colors");
        text.setFont(Font.font(20));
        text.setFill(Color.BLUE);

        // creating four horizontal scroll bars
        ScrollBar red = new ScrollBar();
        ScrollBar green = new ScrollBar();
        ScrollBar blue = new ScrollBar();
        ScrollBar opacity = new ScrollBar();

        // setting the maximum values
        red.setMax(255);
        green.setMax(255);
        blue.setMax(255);
        opacity.setMax(100);

        // setting starting values
        red.setValue(0);
        green.setValue(0);
        blue.setValue(255);
        opacity.setValue(100);

        // changing text color when a scroll bar moves
        InvalidationListener listener = e -> {
            text.setFill(Color.rgb(
                (int) red.getValue(),
                (int) green.getValue(),
                (int) blue.getValue(),
                opacity.getValue() / 100
            ));
        };

        // adding the listener to all four scroll bars
        red.valueProperty().addListener(listener);
        green.valueProperty().addListener(listener);
        blue.valueProperty().addListener(listener);
        opacity.valueProperty().addListener(listener);

        // creating a GridPane
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);

        // adding labels and scroll bars
        pane.add(new Label("Red"), 0, 0);
        pane.add(red, 1, 0);

        pane.add(new Label("Green"), 0, 1);
        pane.add(green, 1, 1);

        pane.add(new Label("Blue"), 0, 2);
        pane.add(blue, 1, 2);

        pane.add(new Label("Opacity"), 0, 3);
        pane.add(opacity, 1, 3);

        // Create a VBox for the text and scroll bars
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(text, pane);

        // creating the scene
        Scene scene = new Scene(root, 350, 250);

        // displaying the window
        primaryStage.setTitle("Exercise 16.17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
