package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class controllerClass {

    @FXML
    private TextField descBox;
    //They'll enter the description of their to do in the list

    @FXML
    private TextField dueDateBox;
    //Saves the due date

    @FXML
    private MenuItem fileSave;
    //Allows them to save the to do list as a text file to their local drive

    @FXML
    private TextField nameBox;
    //Saves the name of the to do

    @FXML
    private Button submitButton;
    //When they click submit it will grab the values of the three text fields above and insert them into
    //the tableView using setNameDescDueDate as seen below

    @FXML
    void saveFile(ActionEvent event) {
        //save
    }

    @FXML
    void setNameDescDueDate(ActionEvent event) {
        //set the names to the tableView and such
    }

}
