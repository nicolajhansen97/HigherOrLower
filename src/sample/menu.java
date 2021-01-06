package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class menu {

    @FXML
    Label lStart, lExit;

    @FXML
    public void handleStartGame(MouseEvent mouseEvent) throws IOException {
        Parent gameStart = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene gameViewScene = new Scene(gameStart);

        Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(gameViewScene);
        window.show();
    }

    @FXML
    public void handleExit(MouseEvent mouseEvent2) {
        System.exit(0);
    }

    public void handleRules(MouseEvent mouseEvent) throws IOException {
        Parent gameStart = FXMLLoader.load(getClass().getResource("rules.fxml"));
        Scene gameViewScene = new Scene(gameStart);

        Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(gameViewScene);
        window.show();
    }

    public void handleCredits(MouseEvent mouseEvent) throws IOException {
        Parent gameStart = FXMLLoader.load(getClass().getResource("credits.fxml"));
        Scene gameViewScene = new Scene(gameStart);

        Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(gameViewScene);
        window.show();
    }
}

