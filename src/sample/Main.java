/*
    Author: Domenic Catalano
    Date: Wednesday, December 9, 2020
    Program Name: Lesson 13 (ICE 12)
 */

package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application
{

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        // Step 1: Create a controls
        Label helloLabel = new Label("Hello, World!");

        Font font = Font.font("Consolas", FontWeight.BOLD, 40);

        Button clickMeButton = new Button("Click me");
        clickMeButton.setFont(font);

        clickMeButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                System.out.println("Click Me Button Clicked!");

                helloLabel.setText("Clicked!");
            }
        });

        // Step 2: Create a container
        //HBox hbox = new HBox(helloLabel);

        //VBox vbox = new VBox(helloLabel, clickMeButton);

        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1,0);
        gridPane.add(clickMeButton, 2,1);

        // Step 3: Add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        // Step 4: Add scene to stage
        primaryStage.setScene(scene);

        // Step 5: Show
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
