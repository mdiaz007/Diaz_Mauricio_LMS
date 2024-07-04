/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	Main: This is the main class for the library management system, it is what pulls
	all necessary functions together so that the user can add, remove, check in, checkout,
	and see book information.
*/

package LMS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) {

        launch(args);

        // Original Main >
//        Scanner scanner = new Scanner(System.in); // Scanner for reading user input.
//        Book book = new Book(); // Creating book object, used for holding book data.
//        book.menuOptions(scanner); // Calls menuOptions which begins the program.

    }

    @Override // Good practice to include, generates error if extension doesn't work.
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Scenes/PStartScreen.fxml"));
        Scene scene = new Scene(root, 800, 600);

        String css = this.getClass().getResource("Styles.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();

    }


}

/*
* TODO: Module 9
* Need to connect functions to database for the importing and exporting of data.
* Organize project files to use standard java project structure, checkout MAVEN.
* */
