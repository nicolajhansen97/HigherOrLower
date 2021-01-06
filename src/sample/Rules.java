package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Rules {
    public void handleMainMenu(MouseEvent mouseEvent) throws IOException {
            Parent gameStart = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene gameViewScene = new Scene(gameStart);

            Stage window = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(gameViewScene);
            window.show();
        }
    }

