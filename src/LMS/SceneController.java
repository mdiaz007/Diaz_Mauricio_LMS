package LMS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    Book book = new Book();

    public void PStartScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scenes/PStartScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 800, 600);


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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
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


        // Goes on every scene in this class.
        stage.setMaximized(true);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    // Button functions

    @FXML
    private TextField InputText;
    @FXML
    private TextField OutputText;

    public void actionImport(ActionEvent actionEvent) throws IOException{
        String holder = book.importBooks(InputText.getText());
        OutputText.setText(holder);
    }

    public void removeTitle(ActionEvent actionEvent) throws IOException{
        String holder = book.deleteBookTitle(InputText.getText());
        OutputText.setText(holder);
    }

    public void removeBarcode(ActionEvent actionEvent) throws IOException{
        String holder = book.deleteBookBarcode(InputText.getText());
        OutputText.setText(holder);
    }

    public void checkIn(ActionEvent actionEvent) throws IOException{
        String holder = book.checkInBook(InputText.getText());
        OutputText.setText(holder);
    }

    public void checkOut(ActionEvent actionEvent) throws IOException{
        String holder = book.checkOutBook(InputText.getText());
        OutputText.setText(holder);
    }



}
