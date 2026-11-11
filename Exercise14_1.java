
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.File;

public class Exercise14_1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Folder containing all four flag images
        String folder = "14-1 Images/Images/";

        // loading each flag image from the folder
        // loading the four GIF images
        Image flag1 = new Image(new File(folder + "flag1.gif").toURI().toString());
        Image flag2 = new Image(new File(folder + "flag2.gif").toURI().toString());
        Image flag6 = new Image(new File(folder + "flag6.gif").toURI().toString());
        Image flag7 = new Image(new File(folder + "flag7.gif").toURI().toString());

        // creating ImageView objects to display the images
        ImageView image1 = new ImageView(flag1);
        ImageView image2 = new ImageView(flag2);
        ImageView image3 = new ImageView(flag6);
        ImageView image4 = new ImageView(flag7);

        //setting the width of all four images
        image1.setFitWidth(150);
        image2.setFitWidth(150);
        image3.setFitWidth(150);
        image4.setFitWidth(150);

        // keeping the original image proportions
        image1.setPreserveRatio(true);
        image2.setPreserveRatio(true);
        image3.setPreserveRatio(true);
        image4.setPreserveRatio(true);

        //creating a GridPane to arrange the images
        GridPane pane = new GridPane();

        // setting spacing between images
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10));

        // adding images to the grid (column, row)
        pane.add(image1, 0, 0); // Top left
        pane.add(image2, 1, 0); // Top right
        pane.add(image3, 0, 1); // Bottom left
        pane.add(image4, 1, 1); // Bottom right

        // creating the scene and display the window
        Scene scene = new Scene(pane, 330, 220);

        primaryStage.setTitle("Exercise 14.1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
