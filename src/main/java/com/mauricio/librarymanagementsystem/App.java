/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	App: This is the main class of my library management system (LMS), it opens the GUI which then allows
	the user to interact with the LMS.
*/

package com.mauricio.librarymanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App extends Application {

    public static void run(String[] args) {
        Application.launch(args);
    }

    @Override // Good practice to include, generates error if extension doesn't work.
    public void start(Stage stage) throws IOException { // Starts up GUI on start screen.

        // If database exists do this

        Path file = Path.of("LMS_DATABASE.db");

        if (Files.exists(file)){ // If database exists then do this
            // Creates the first scene.
            Parent root = FXMLLoader.load(getClass().getResource("PStartScreen.fxml"));
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
        }else{ // If it doesn't exist do this

            Parent root = FXMLLoader.load(getClass().getResource("POnboardingOne.fxml"));
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

}
