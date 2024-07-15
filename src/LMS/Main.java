/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	Main: This is the main class of my library management system (LMS), it opens the GUI which then allows
	the user to interact with the LMS.
*/

package LMS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


import java.sql.ResultSet;
import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args); // Launches JavaFX GUI.

//        String sqlCommand = "SELECT * FROM BOOKS WHERE STATUS = 'Checked-Out'";
//
//
//        System.out.println(sqlCommand);
//        ArrayList<String> list = Database.DatabaseConnect(sqlCommand, 2);
//
//        for(int x = 0; x < list.size(); x++) { // Add to controller
//            System.out.println(list.get(x));
//        }

    }

    @Override // Good practice to include, generates error if extension doesn't work.
    public void start(Stage stage) throws IOException { // Starts up GUI on start screen.

        // Creates the first scene.
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/PStartScreen.fxml"));
        Scene scene = new Scene(root, 800, 600);

        // Allows for use of CSS to add styling to GUI.
        String css = this.getClass().getResource("Styles.css").toExternalForm();
        scene.getStylesheets().add(css);

        // Sets stage options.
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();

    }

}
