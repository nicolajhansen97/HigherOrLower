package sample;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    static Random rnd = new Random();
    static int score;
    static int nextNum = 10;

    @FXML
    Button bLow, bHigh, bRestart;

    @FXML
    Label lNumber, lScore, lGameOver;

    public void chooseLower(MouseEvent mouseEvent) {

        String currentNum1 = lNumber.getText();
        int currentNum = Integer.parseInt(currentNum1);

        nextNum = rnd.nextInt(21);
        String text = String.valueOf(nextNum);
        lNumber.setText(text);

        if(currentNum > nextNum )
        {
            score++;
            lScore.setText("Score: " + score);
        }
        else{
            bLow.setDisable(true);
            bHigh.setDisable(true);
            lNumber.setText("The number was: " + text);
            bRestart.setVisible(true);
            lGameOver.setVisible(true);
        }
    }

    public void chooseHigher(MouseEvent mouseEvent) {

        String currentNum1 = lNumber.getText();
        int currentNum = Integer.parseInt(currentNum1);

        nextNum = rnd.nextInt(21);
        String text = String.valueOf(nextNum);
        lNumber.setText(text);

        if(currentNum < nextNum )
        {
            score++;
            lScore.setText("Score: " + score);
        }
        else{
            bLow.setDisable(true);
            bHigh.setDisable(true);
            lNumber.setText("The number was: " + text);
            bRestart.setVisible(true);
            lGameOver.setVisible(true);
        }
    }

    public void handleRestart(MouseEvent mouseEvent) {
        bRestart.setVisible(false);
        score = 0;
        lScore.setText("Score: 0");
        lNumber.setText("10");
        bLow.setDisable(false);
        bHigh.setDisable(false);
        lGameOver.setVisible(false);
    }
}
