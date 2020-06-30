
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * Test program using Graphics for Circle4
 *
 * @author Sam Scott
 */
public class Circle4Test extends Application {

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
        Circle4 c = new Circle4(50, 200, 150);
        Circle4 d = new Circle4(100, 290, 150);
        c.draw(gc);
        d.draw(gc);
        
        System.out.println(c);
        System.out.println(d);
        if (c.isInside(d)) {
            System.out.println("C is inside of D");
        }
        if (d.isInside(c)) {
            System.out.println("D is inside of C");
        }

        gc.fillText("" + c, 5, 20);
        gc.fillText("" + d, 5, 40);
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
