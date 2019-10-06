import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color; //--- importing java color (17)
import javafx.stage.Stage;
import javafx.scene.shape.Polygon; //--- importing java polugon (14)
import javafx.scene.text.Font; //--- importing java font (16)
import javafx.scene.text.Text;//--- //--- importing java text (15)

public class Exercise14_15 extends Application { 
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane, a polygon, and place polygon to pane
    StackPane pane = new StackPane(); //--- new pane define (1)
    Polygon polygon = new Polygon();//--- new polygon define (2)
    polygon.setFill(Color.RED);//--- color will be red (3)
    ObservableList<Double> list = polygon.getPoints();

    final double WIDTH = 200, HEIGHT = 200;//--- using final so it is the final value of it (4)
    double centerX = WIDTH / 2, centerY = HEIGHT / 2; //--- using double becasue in calculation of the formual it can be double (5)
    double radius = Math.min(WIDTH, HEIGHT) * 0.4; //--- using double and math.min nethod (13)

    // Add points to the polygon list
    for (int i = 0; i < 8; i++) {//--- using a for loop for adding point (6)
      list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8 - Math.PI / 8));//--- using the formula and we also usr math.p method instead of 3.14 (7)
      list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8 - Math.PI / 8));
    }

    Text text = new Text("STOP");//--- using sting stop for sowing stop (8)
    text.setFill(Color.WHITE); //--- text fill color will be white (9)
    text.setFont(Font.font("Times New Roman", 40)); //--- setting text to be times new roman with size 40 (10)

    pane.getChildren().addAll(polygon, text);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, WIDTH, HEIGHT); //--- psnr eidth snf height (11)
    primaryStage.setTitle("Exercise14_15"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);//--- using launch arsg (12)
  }
}
