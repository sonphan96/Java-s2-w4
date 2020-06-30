

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * Example to help with Assignment 3.
 *
 * @author Sam Scott
 */
public class SquareDonutTest extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(400, 300); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 
        SquareDonut sd1 = new SquareDonut(10, 10, 100);
        SquareDonut sd2 = new SquareDonut(200, 10, 10);
        SquareDonut sd3 = new SquareDonut(150, 50, 200);
        sd1.draw(gc);
        sd2.draw(gc);
        sd3.draw(gc);
        // YOUR CODE STOPS HERE
        
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
