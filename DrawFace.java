import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
public class DrawFace extends Application {
//method to create a Face and return as a Group
    Group createFace(double size) {
        //defining a circle to represent the face
        Circle face = new Circle(size / 2);
        //disabling the fill color and enabling stroke to allow a black outlineinstead of filling with colors
        face.setFill(Color.TRANSPARENT);
        face.setStroke(Color.BLACK);
        //defining two ellipses for the eyes
        Ellipse eye1 = new Ellipse(size / 10, size / 15);
        eye1.setFill(Color.TRANSPARENT);
        eye1.setStroke(Color.BLACK);
        Ellipse eye2 = new Ellipse(size / 10, size / 15);
        eye2.setFill(Color.TRANSPARENT);
        eye2.setStroke(Color.BLACK);
        //defining two ellipses for the eyeballs
        Ellipse eyeBall1 = new Ellipse(size / 20, size / 20);
        Ellipse eyeBall2 = new Ellipse(size / 20, size / 20);
        //defining a Polygon for the nose, we will add the points later
        Polygon nose = new Polygon();
        //setting the coordinates of face
        face.setCenterX(size / 2);
        face.setCenterY(size / 2);
        //setting the coordinates of eyes with respect to face
        eye1.setCenterX(face.getCenterX() - 60);
        eye1.setCenterY(face.getCenterY() - 60);
        eye2.setCenterX(face.getCenterX() + 60);
        eye2.setCenterY(face.getCenterY() - 60);
        //setting the coordinates of eyeballs with respect to eyes
        eyeBall1.setCenterX(eye1.getCenterX());
        eyeBall1.setCenterY(eye1.getCenterY());
        eyeBall2.setCenterX(eye2.getCenterX());
        eyeBall2.setCenterY(eye2.getCenterY());
        //setting the coordinates of nose with respect to face
        nose.getPoints().setAll(
                face.getCenterX(), face.getCenterY() - 30,
                face.getCenterX() + 30, face.getCenterY() + 30,
                face.getCenterX() - 30, face.getCenterY() + 30
        );
        nose.setFill(Color.TRANSPARENT);
        nose.setStroke(Color.BLACK);
        //Defining an arc for the mouth the parameters are center x, center y,x radius, y radius, starting angle and length
        Arc mouth = new Arc(face.getCenterX(), face.getCenterY(), 100, 100, 220, 100);
        mouth.setFill(Color.TRANSPARENT);
        mouth.setStroke(Color.BLACK);
        //Adding all parts to a group and returning it
        Group group = new Group(face, eye1, eye2, eyeBall1, eyeBall2, nose, mouth);
        return group;
    }
    @Override
    public void start(Stage primaryStage) {
        int size = 300; //size of the face
        //creating a face, adding all components to a Group
        Group face = createFace(size);
        //setting up a Scene and displaying it
        Scene scene = new Scene(face);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
/* UML
DrawFace
Circle DrawFace()
createFace(double):Group
start(Stage):void
main(String[]):void
*/
