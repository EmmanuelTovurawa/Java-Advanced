/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package clickme;

import javafx.application.*;
import javafx.event.*;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Manex
 */
public class ClickMe extends Application {

    public static void main(String[] args) {
        launch(args);
        System.out.println("Done");
    }
    Button btn;

    @Override
    public void start(Stage primaryStage) {
// Create the button//
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
// Add the button to a layout pane//
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
// Add the layout pane to a scene//
        Scene scene = new Scene(pane, 300, 250);
// Add the scene to the stage, set the title
// and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }

    public void buttonClick() {
        if (btn.getText() == "Click me please!") {
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }

}
