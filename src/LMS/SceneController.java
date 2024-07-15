/*
	Mauricio Diaz
	CEN3024C
	July 12, 2024
	Software Development 1

	SceneController: This is the SceneController class. This class is responsible for holding
	all the scene data for all the possible scenes in the LMS.
*/


package LMS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    Book book = new Book();

    public void PStartScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PStartScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Different settings than other scenes in this class.
        stage.setMaximized(false);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }


    // Similar
    public void PMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PMainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void PBookCatalog(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PBookCatalog.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void PBookCheckIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PBookCheckIn.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void PBookCheckOut(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PBookCheckOut.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void PBookAvailableCatalog(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PBookAvailableCatalog.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void PBookUnavailableCatalog(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PBookUnavailableCatalog.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void exitCommand(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PBookUnavailableCatalog.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }

    // Admin Scenes
    public void AMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/AMainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void ABookAdd(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/ABookAdd.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void ABookRemove(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/ABookRemove.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public void ABookImport(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/ABookImport.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);

        // Same settings for every scene in the class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    /*
     These functions are responsible for executing functions from the book
     class when a specific button is pressed in the GUI.

     @FXML tags allow for private variables to be seen/connected to respective FXML file
     so that the action does what it is supposed to do.
    */

    @FXML
    private TextField InputText;
    @FXML
    private TextField OutputText;
    @FXML
    private TextField InputTitle;
    @FXML
    private TextField InputAuthor;
    @FXML
    private TextField InputReleaseYear;
    @FXML
    private TextField InputBarcode;
    @FXML
    private TextArea OutputTextArea;

    public void actionImport(ActionEvent actionEvent) throws IOException{
        String holder = Functions.importBooks(InputText.getText(), book);
        OutputText.setText(holder);
    }

    public void actionAdd(ActionEvent actionEvent) throws IOException{

        book.setTitle(InputTitle.getText());
        book.setAuthor(InputAuthor.getText());
        book.setReleaseYear(Integer.parseInt(InputReleaseYear.getText()));
        book.setBarcode(InputBarcode.getText());

        Functions.addBook(1, book);
        OutputTextArea.setText("Added Book: " + InputTitle.getText());
    }

    public void removeTitle(ActionEvent actionEvent) throws IOException{
        book.setTitle(InputText.getText());

        String holder = Functions.deleteBookTitle(book);
        OutputText.setText(holder);
    }

    public void removeBarcode(ActionEvent actionEvent) throws IOException{

        book.setBarcode(InputText.getText());

        String holder = Functions.deleteBookBarcode(book);
        OutputText.setText(holder);
    }

    public void checkIn(ActionEvent actionEvent) throws IOException{

        book.setTitle(InputText.getText());

        String holder = Functions.checkInBook(book);
        OutputText.setText(holder);
    }

    public void checkOut(ActionEvent actionEvent) throws IOException{
        book.setTitle(InputText.getText());

        String holder = Functions.checkOutBook(book);

        OutputText.setText(holder);
    }

    public void AvailableBooks(ActionEvent actionEvent) throws IOException{
        ArrayList<String> list = new ArrayList<String>();
        list = Functions.seeAvailableBooks();

        for(int x = 0; x < list.size(); x++) { // Add to controller
            OutputTextArea.appendText(list.get(x) + "\n");
        }

    }

    public void UnavailableBooks(ActionEvent actionEvent) throws IOException{
        ArrayList<String> list = new ArrayList<String>();
        list = Functions.seeUnavailableBooks();

        for(int x = 0; x < list.size(); x++) { // Add to controller
            OutputTextArea.appendText(list.get(x) + "\n");
        }
    }

}
