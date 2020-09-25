package javaFX.mostrandoAlert.gui;

import javaFX.mostrandoAlert.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button buttonTest;

    @FXML
    public void onButtonTestAction() {
        Alerts.showAlert("Alert title", null, "Hello", Alert.AlertType.INFORMATION);
    }

}
