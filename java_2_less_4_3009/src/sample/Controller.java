package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea chat;

    @FXML
    public TextField textAddChat;

    public void clickBtnAddText(ActionEvent actionEvent) {


        chat.setEditable(false);
        chat.appendText(textAddChat.getText() + "\n");
        textAddChat.requestFocus();
        textAddChat.clear();

    }
}
