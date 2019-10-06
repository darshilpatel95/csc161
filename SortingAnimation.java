import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SortingAnimation extends Application {
    private int[] array;
    private BarChart barChart;
    private boolean swap(int[] arr, int index1, int index2) {
        if (index1 == index2) {
            return false;
        }
        else {
            int tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
            return true;
        }
    }
    private void bubbleSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; --j) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    private void selectionSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int minIndex = 0;
        int minVal = 0;
        for (int j = 0; j < (arr.length - 1); j++) {
            //System.out.println("Iteration " + j);
            //printArray(arr);
            minIndex = j;
            minVal = arr[j];
            for (int k = j + 1; k < arr.length; k++) {

                if (arr[k] < minVal) {

                    minVal = arr[k];
                    minIndex = k;
                }
            }
            swap(arr, j, minIndex);
        }
    }
    private void performSelectionSortIteration(int[] arr,int j)
    {
        int minIndex = j;
        int minVal = arr[j];
            for (int k = j + 1; k < arr.length; k++) {

                if (arr[k] < minVal) {

                    minVal = arr[k];
                    minIndex = k;
                }
            }
            swap(arr, j, minIndex);
    }
    private int[] generateRandomArray()
    {
        int min=1,max=20;
        int[] array=new int[max];
        Random random=new Random();
        for(int i=0;i<max;i++)
        {
            array[i]=random.nextInt(max - min) + min;
        }
        return array;
    }
      private void printArray(int[] arr) {
        System.out.print("[ ");
        for (int j = 0; j < (arr.length - 1); j++) {
            System.out.print(arr[j] + ", ");
        }
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }
        System.out.println(" ]");
    }
    private BarChart generateBarChart(int[] array)
    {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart bc = new BarChart(xAxis,yAxis);
        XYChart.Series series = new XYChart.Series();
        for(int i=0;i<array.length;i++)
        {
            series.getData().add(new XYChart.Data(Integer.toString(i),array[i]));
        }
        bc.getData().addAll(series);
        return bc;
    }
    @Override
    public void start(Stage primaryStage) {

        array=generateRandomArray();
        printArray(array);
        barChart=generateBarChart(array);
        //reset button
        Button resetButton = new Button();
        resetButton.setText("Reset");
        resetButton.setPrefSize(100, 20);
        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                array=generateRandomArray();
                printArray(array);
                XYChart.Series series = new XYChart.Series();
                for(int i=0;i<array.length;i++)
                {
                    series.getData().add(new XYChart.Data(Integer.toString(i),array[i]));
                }
                barChart.getData().clear();
                barChart.getData().addAll(series);
            }
        });
        Button stepButton = new Button();
        stepButton.setText("Step");
        stepButton.setPrefSize(100, 20);
        stepButton.setOnAction(new EventHandler<ActionEvent>() {
            int step=0;
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Step of sorting");
                performSelectionSortIteration(array, step);
                if(step<20)
                    step++;
                else
                    System.out.println("Array sorted");
                printArray(array);
                XYChart.Series series = new XYChart.Series();
                for(int i=0;i<array.length;i++)
                {
                    series.getData().add(new XYChart.Data(Integer.toString(i),array[i]));
                }
                barChart.getData().clear();
                barChart.getData().addAll(series);
            }
        });
        HBox hb=new HBox();
        hb.setPadding(new Insets(15, 12, 15, 12));
        hb.setSpacing(10);
        hb.getChildren().addAll(stepButton,resetButton);
        BorderPane root = new BorderPane();
        root.setCenter(barChart);
        root.setBottom(hb);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Sorting Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
}