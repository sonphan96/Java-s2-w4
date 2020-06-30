package week4code;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;

/**
 * Test program using Graphics for Circle4
 *
 * @author Sam Scott
 */
public class Circle5Test extends Application {

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
        Circle5 c = new Circle5(); // 4 ways to create a Circle5 object!
        Circle5 d = new Circle5(50);
        Circle5 e = new Circle5(300, 200);
        Circle5 f = new Circle5(123, 45, 67);
        c.draw(gc);
        d.draw(gc);
        e.draw(gc);
        f.draw(gc);
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
